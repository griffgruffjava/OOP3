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
		
		JPane pane = new JPane;
		myFrame.add(goodShoots);
		myFrame.add(badShoots);
		
		badShoots.addActionListener(arg0);
		
		
		
	}
	
	
	
}
