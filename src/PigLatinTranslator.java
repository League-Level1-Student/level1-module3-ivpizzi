import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator
{
	public static void main(String args[])
	{
		PigLatinTranslator p = new PigLatinTranslator();
		p.createGUI();
	}
	
	void createGUI()
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JTextField textField = new JTextField(15);
		panel.add(textField);
		
		JButton button = new JButton();
		button.setText("Translate");
		panel.add(button);
		
		JTextField textField2 = new JTextField(15);
		panel.add(textField2);
		
		frame.pack();
	}
}
