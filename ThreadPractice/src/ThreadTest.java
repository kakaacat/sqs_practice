import java.awt.Container;

import javax.swing.JFrame;

public class ThreadTest extends JFrame{

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		
		jFrame.setTitle("ThreadTest"); //����		
		jFrame.setBounds(400, 200, 300, 300);//��Сλ��
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);
		jFrame.setVisible(true);
		
		jFrame.add(new ThreadPanel());
	}

}
