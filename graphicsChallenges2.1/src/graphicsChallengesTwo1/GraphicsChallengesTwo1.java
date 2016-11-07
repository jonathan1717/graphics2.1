package graphicsChallengesTwo1;
import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
public class GraphicsChallengesTwo1 extends Canvas 
	{
		static Color color;
		static int size;
		static size;
		static String color1;
		
	private static final long	serialVersionUID	= 1L;

    	public static void main(String[] args) 
    		{
    		Scanner userInput= new Scanner (System.in);
    		System.out.println("What would you like the size of the square to be? i.e.(500)  It must be less than 1000.");
    		System.out.println();
    		
    		size = userInput.nextInt();
    		Scanner userInput2= new Scanner (System.in);
    		
    		System.out.println("Now what would you like the color to be? Red or blue?");
    		color1= userInput2.nextLine();
	        GraphicsChallengesTwo1 canvas = new GraphicsChallengesTwo1();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null);
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			if (color1.equals("red"))
    				{
    					 graphics.setColor(Color.red);
    					
    				}
    			else if (color1.equals("blue"))
    				{
    					 graphics.setColor(Color.blue);
    					
    				}

    			 graphics.fillRect(100,100,size,size);
    		}
    	
    	
    }