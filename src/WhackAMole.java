import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	
	Date timeAtStart = new Date();
	
	int whacks = 0;
	int score = 0;
	
	void createGUI()
	{
		frame.setVisible(true);
		frame.setSize(250, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		drawButtons(createRandom());
	}
	
	int createRandom()
	{
		Random r = new Random();
		int random = r.nextInt(9);
		return random;
	}
	
	void drawButtons(int num)
	{
		panel.removeAll();
		
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
	
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + (molesWhacked / ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00))
	          + " moles per second.");
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton buttonPressed = (JButton)e.getSource();
		whacks++;
		
			if(buttonPressed.getText() == "MOLE")
			{
				score++;
			}
			else
			{
				speak("miss");
			}
			
			if(score >= 10)
			{
				endGame(timeAtStart, score);
			}
			else
			{
				frame.dispose();
				createGUI();
			}
	}
}
