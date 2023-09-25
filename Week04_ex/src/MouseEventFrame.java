import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Mouse 이벤트 리스너 작성
public class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		super("마우스 올리기 내리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("덕성아");
		label.addMouseListener(new MouseAdapter() { //Mouse 이벤트 리스너 작성 시작
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("덕성아");
			}			
		});
		c.add(label);
		setSize(250,150);
		setVisible(true);
	}
	
	static public void main(String [] args) {
		new MouseEventFrame();
	}
}
