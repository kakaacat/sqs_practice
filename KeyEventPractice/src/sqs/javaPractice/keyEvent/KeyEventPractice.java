package sqs.javaPractice.keyEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KeyEventPractice extends JFrame implements KeyListener{

	JTextArea jt = new JTextArea();//�����ı�����
	
	public KeyEventPractice() {
		super("�����¼�");
		setBounds(700, 300, 400, 400);
		
		JScrollPane sp = new JScrollPane(); //��ӹ�����
		sp.setViewportView(jt);
		
		add(sp,"Center");
		jt.addKeyListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		KeyEventPractice k = new KeyEventPractice();

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		String keytext = KeyEvent.getKeyText(arg0.getKeyCode());
		if (arg0.isActionKey()) {
			System.out.println("�����µ��Ƕ���������" + keytext + "��");
		}else {
			System.out.println("�����µ��ǷǶ���������" + keytext + "��");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("���ͷŵ��ǣ���" + e.getKeyChar() + "��");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("���˴�������ǣ���" + e.getKeyChar() + "��");
		
	}

}
