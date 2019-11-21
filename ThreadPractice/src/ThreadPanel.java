import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ThreadPanel extends JPanel implements Runnable {

	public int ypos = -80; //小球最初的y坐标
	
	public ThreadPanel() {
		//创建一个新线程
		Thread t = new Thread(this);
		//启动线程
		t.start();
	}
	

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(30); //线程休眠30ms
			} catch (InterruptedException e) {}
			ypos += 5; //修改y坐标
			if(ypos > 300) {
				ypos = -80;
			}
			repaint(); 
		}
		
	}
	
	@Override
	public void paint(Graphics arg0) {
		//super.paint(arg0); //将面板上原来的东西清除
		arg0.clearRect(0, 0, this.getWidth(), this.getHeight());
		arg0.setColor(Color.RED); //设置小球颜色
		arg0.fillOval(90, ypos, 80, 80);//绘制小球
	}
	
}
