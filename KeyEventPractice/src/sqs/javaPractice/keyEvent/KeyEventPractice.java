package sqs.javaPractice.keyEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KeyEventPractice extends JFrame implements KeyListener{

	JTextArea jt = new JTextArea();//多行文本容器
	
	public KeyEventPractice() {
		super("键盘事件");
		setBounds(700, 300, 400, 400);
		
		JScrollPane sp = new JScrollPane(); //添加滚动条
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
			System.out.println("您按下的是动作键：“" + keytext + "”");
		}else {
			System.out.println("您按下的是非动作键：“" + keytext + "”");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("您释放的是：“" + e.getKeyChar() + "”");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("您此次输入的是：“" + e.getKeyChar() + "”");
		
	}

}
