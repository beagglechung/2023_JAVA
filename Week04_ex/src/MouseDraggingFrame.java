import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Mouse 이벤트와 MouseMotion 이벤트 함께 처리
public class MouseDraggingFrame extends JFrame {
	public MouseDraggingFrame() {
		super("드래깅동안 YELLOW로 변경");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		
		MyMouseListener ml = new MyMouseListener();
		c.addMouseMotionListener(ml);
		c.addMouseListener(ml);
		
		setSize(250,150);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) { //마우스 드래깅할 때
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		public void mouseMoved(MouseEvent e) {} //마우스를 움직여도 아무 동작이 일어나지 않음
		
		public void mouseReleased(MouseEvent e) { //마우스가 뗴어지는 순간
			Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN);
		}		
	}
	static public void main(String [] args) {
		new MouseDraggingFrame();
	}
}
