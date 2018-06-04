import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker
{
	public static void main(String[] args)
	{
		ChuckleClicker c = new ChuckleClicker();
		c.createGUI();
	}
	
	void createGUI()
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		button1.setText("joke");
		button2.setText("punch line");
		panel.add(button1);
		panel.add(button2);
		
		frame.pack();
	}
	
	void sayHi()
	{
		JOptionPane.showMessageDialog(null, "Hi");
	}
}
