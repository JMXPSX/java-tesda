/* Program Name: FirstSwingGUI
   Created By: John Michael Go
   Creation Date: Jan. 18, 2013 Day 6
   Note: Program displays GUI interface with labels and buttons.
*/
import javax.swing.*;

public class FirstSwingGUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My First GUI");
		
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("LABEL1");
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(label);
		
		JButton button = new JButton ("SUB ZERO");
		panel.add(button);
		button.setLocation(50, 50);
		
	} // end main

} // end class

