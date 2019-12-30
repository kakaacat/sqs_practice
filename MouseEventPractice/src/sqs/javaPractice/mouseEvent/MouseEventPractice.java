package sqs.javaPractice.mouseEvent;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventPractice extends JFrame implements MouseListener{

	JLabel jLabel = new JLabel();
	public MouseEventPractice() {
		
		super("鼠标事件");
		setBounds(700, 300, 400, 300);
		setLayout(null); //去掉布局管理器
		
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
		jLabel.setText("鼠标点击了 " + e.getClickCount() + " 次");
		System.out.println("鼠标点击");
		System.out.println("鼠标点击了 " + e.getClickCount() + " 次");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		jLabel.setText("鼠标移入");
		System.out.println("鼠标移入");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("鼠标移出");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == 1) {
			System.out.println("鼠标左键被按下");
		}else if (e.getButton() == 2) {
			System.out.println("鼠标中键被按下");
		}else if (e.getButton() == 3) {
			System.out.println("鼠标右键被按下");
		}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("鼠标被释放");		
	}
}
