import java.util.Random;
import java.awt.*;

import javax.swing.*;


public class Checkerboard extends JFrame{

// FIX THIS 
	
		  public Checkerboard()
		    {
		        super ("Checkerboard");
		        setSize(600,600);
		        setVisible(true);
		        repaint();
		    }
		  
		  public void paint(Graphics g) {
			 
			  super.paint(g);
			  g.setColor(Color.red);
	          for ( int x = 40;  x <= 320;  x += 40) {
	          
	           if(g.getColor() == Color.black) {
	        	   g.setColor(Color.red);
	             } else {g.setColor(Color.black);}
	           for(int i = 40; i <= 320; i += 40) {
	        	   
	        	   g.fillRect(x,  i,  40, 40);
	        	   try {
	   	  			Thread.currentThread().sleep(200);
	   	  		}
	   	  			catch (InterruptedException e)   {
	   	  				e.printStackTrace();
	   	  			}
	        	   if (g.getColor() == Color.black) {
	        		   g.setColor(Color.red);
	        		   
	        	   } else {
	        		   g.setColor(Color.black);
	        	   }
	           }
	          
	          } 
	      	
	  		
	  		
	       
	       }  
			public static void main(String[] args) {
				Checkerboard application = new Checkerboard();
				application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }  

	}


