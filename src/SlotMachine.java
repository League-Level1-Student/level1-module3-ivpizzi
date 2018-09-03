import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener
{
	public static void main(String[] args)
	{
		SlotMachine s = new SlotMachine();
		s.createGUI();
	}
	
	JLabel slot1 = loadImage("cherries.png");
	JLabel slot2 = loadImage("lemon.png");
	JLabel slot3 = loadImage("watermelon.png");
	
	void createGUI()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton();
		button.setText("Spin");
		button.addActionListener(this);
		
		panel.add(button);
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		frame.pack();
	}
	
	String chooseRandomImage()
	{
		Random r = new Random();
		int random = r.nextInt(3);
		String image = "";
		if(random == 0)
		{
			image = "cherries.png";
		}
		else if(random == 1)
		{
			image = "lemon.png";
		}
		else if (random == 2)
		{
			image = "watermelon.png";
		}
		
		return image;
	}
	
	private JLabel loadImage(String fileName)
	{
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		slot1 = loadImage(chooseRandomImage());
		slot2 = loadImage(chooseRandomImage());
		slot3 = loadImage(chooseRandomImage());
	}
}
