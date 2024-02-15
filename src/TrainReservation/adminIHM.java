package TrainReservation;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AdminIHM {

    public static void main(String[] args) {
        // Create the JFrame (window)
        JFrame frame = new JFrame("Simple Swing Example");
        frame.setSize(300, 200); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed

        // Create a JButton
        JButton button = new JButton("Click Me!");

        // Add the button to the content pane of the frame
        frame.getContentPane().add(button);

        // Make the frame visible
        frame.setVisible(true);
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
