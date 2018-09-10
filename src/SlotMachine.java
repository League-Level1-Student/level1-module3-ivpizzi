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
import javax.swing.JOptionPane;
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
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	void createGUI()
	{
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
		
		System.out.println(image);
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
		panel.remove(slot1);
		panel.remove(slot2);
		panel.remove(slot3);
		
		String slot1i = chooseRandomImage();
		String slot2i = chooseRandomImage();
		String slot3i = chooseRandomImage();
		
		slot1 = loadImage(slot1i);
		slot2 = loadImage(slot2i);
		slot3 = loadImage(slot3i);
		
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		
		frame.pack();
		
		if(slot1i == slot2i && slot1i == slot3i)
		{
			JOptionPane.showMessageDialog(null, "YOU WON");
		}
	}
}
