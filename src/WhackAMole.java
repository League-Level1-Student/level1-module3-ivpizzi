import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole
{
	
	public static void main(String args[])
	{
		WhackAMole w = new WhackAMole();
		w.createGUI();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	void createGUI()
	{
		frame.setVisible(true);
		frame.setSize(250, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
	}
	
	void drawButtons(int num)
	{
		JButton button1 = new JButton();
		panel.add(button1);
		JButton button2 = new JButton();
		panel.add(button2);
		JButton button3 = new JButton();
		panel.add(button3);
		JButton button4 = new JButton();
		panel.add(button4);
		JButton button5 = new JButton();
		panel.add(button5);
		JButton button6 = new JButton();
		panel.add(button6);
		JButton button7 = new JButton();
		panel.add(button7);
		JButton button8 = new JButton();
		panel.add(button8);
		JButton button9 = new JButton();
		panel.add(button9);
	}
}
