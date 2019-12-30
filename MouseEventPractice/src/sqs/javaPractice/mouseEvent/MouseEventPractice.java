package sqs.javaPractice.mouseEvent;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventPractice extends JFrame implements MouseListener{

	JLabel jLabel = new JLabel();
	public MouseEventPractice() {
		
		super("����¼�");
		setBounds(700, 300, 400, 300);
		setLayout(null); //ȥ�����ֹ�����
		
		jLabel.setOpaque(true);
		jLabel.setBackground(Color.orange);
		jLabel.setBounds(30, 30, 320, 190);
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		
		add(jLabel);
		jLabel.addMouseListener(this);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		MouseEventPractice m = new MouseEventPractice();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		jLabel.setText("������� " + e.getClickCount() + " ��");
		System.out.println("�����");
		System.out.println("������� " + e.getClickCount() + " ��");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		jLabel.setText("�������");
		System.out.println("�������");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("����Ƴ�");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == 1) {
			System.out.println("������������");
		}else if (e.getButton() == 2) {
			System.out.println("����м�������");
		}else if (e.getButton() == 3) {
			System.out.println("����Ҽ�������");
		}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("��걻�ͷ�");		
	}
}
