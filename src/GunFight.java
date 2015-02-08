import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GunFight 
{
	public static void main(String args[])
	{
		JFrame myFrame = new JFrame("Gun Fight!");
		myFrame.setVisible(true);
		myFrame.setSize(300, 300);
		myFrame.setLocation(150,200);
		
		JButton goodShoots = new JButton("Good Guy Shoots");
		JButton badShoots = new JButton("Bad Guy Shoots");
		
		ActionListener buttonWatch = new ActionListener();
		
		badShoots.addActionListener(handler);
		goodShoots.addActionListener(handler);
		
		Container cpane = new Container();
		myFrame.add(cpane);
		cpane.setLayout(new FlowLayout());
		cpane.add(goodShoots);
		cpane.add(badShoots);
		
		
		
		BadGuy bg = new BadGuy();
		GoodGuy gg = new GoodGuy();
		
		
		
		
		
		
		
	}
	private class ButtonHandler implements ActionListener
	{
		
	}
	public void actionPerformed(ActionEvent e)
	
	
}
