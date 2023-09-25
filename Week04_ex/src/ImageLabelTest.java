import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelTest extends JFrame {
	private JPanel panel;
	private JLabel label;

	public ImageLabelTest() {
		setTitle("레이블 테스트");
		setSize(400, 250);

		panel = new JPanel();
		label = new JLabel("");
		ImageIcon icon = new ImageIcon("dog.png");
		label.setIcon(icon);
		panel.add(label);
		add(panel);
		setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ImageLabelTest();
	}
}