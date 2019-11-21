import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ThreadPanel extends JPanel implements Runnable {

	public int ypos = -80; //С�������y����
	
	public ThreadPanel() {
		//����һ�����߳�
		Thread t = new Thread(this);
		//�����߳�
		t.start();
	}
	

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(30); //�߳�����30ms
			} catch (InterruptedException e) {}
			ypos += 5; //�޸�y����
			if(ypos > 300) {
				ypos = -80;
			}
			repaint(); 
		}
		
	}
	
	@Override
	public void paint(Graphics arg0) {
		//super.paint(arg0); //�������ԭ���Ķ������
		arg0.clearRect(0, 0, this.getWidth(), this.getHeight());
		arg0.setColor(Color.RED); //����С����ɫ
		arg0.fillOval(90, ypos, 80, 80);//����С��
	}
	
}
