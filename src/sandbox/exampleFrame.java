package sandbox;


import java.io.*;
import javax.swing.*;

	
public class exampleFrame extends JFrame{
	exampleFrame(){
			setTitle("Example Frame");
			setSize(800,600);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this will exit the code once the window has been closed
		    
		}
		
	public static void main(String[] args)
    {
		try {
				
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
					e.printStackTrace();
				}
		
		
		new exampleFrame();
    }

}

