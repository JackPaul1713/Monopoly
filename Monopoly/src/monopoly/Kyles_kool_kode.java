package monopoly;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Kyles_kool_kode
	{
		public static void runKyle() {
		
			LayeredPaneExample panel = new  LayeredPaneExample();  
		      panel.setVisible(true); 
			
			
		}
		public static int[] rollDice(int numberOfDice, int numberOfSides)
		{
		int counter = 0;
		boolean rolling = true;
		int theTotal = 0;
		int results[] = new int[numberOfDice + 1];
		for(int i = 0; i< numberOfDice; i ++)
		{
		int randomNumber = (int) ( (Math.random()) * numberOfSides) + 1;
		results[counter] = randomNumber;
		theTotal = theTotal + randomNumber;
		}
		return results;
		}
	
	
	
	
		}
		
		
		
		
		
		
		
		
		
	
