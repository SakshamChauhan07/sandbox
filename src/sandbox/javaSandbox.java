package sandbox;


import java.io.*;
import javax.swing.*;


class GFG{
	
	public static void main(String[] args)
    {
		try {
				
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
					e.printStackTrace();
				}
		
       JFrame frame =  new JFrame("Swing");
       
       frame.setSize(800,600);
       
       
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}