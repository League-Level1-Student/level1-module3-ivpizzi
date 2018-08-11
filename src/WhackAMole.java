import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener
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
		
		Random r = new Random();
		int random = r.nextInt(9) + 1;
		drawButtons(random);
	}
	
	void drawButtons(int num)
	{
		for (int i = 0; i < 9; i++)
		{
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if(i == num)
			{
				button.setText("MOLE");
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
