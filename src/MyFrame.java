import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class MyFrame {

	
	     public MyFrame(){
	    	 JFrame f = new JFrame("Connexion") ;
	    	 JPanel panel = new JPanel(); 
	    	 panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS)) ; 
	    	 //TextField Recherche
	    	 JTextField recherche = new JTextField(20) ; 
	    	 
	    	 //Panel Search
	    	 panel.add(recherche) ;
	    	 
	    	 
	    	 //Button Disconnect 
	    	 JButton deconnecte = new JButton(new ImageIcon("images/power.png")) ; 
	    	 deconnecte.setBackground(Color.WHITE); 
	    	 deconnecte.setPreferredSize(new Dimension(28,28)) ;
	    	 deconnecte.setBorderPainted(false);
	    	 
	        
	    	 //add JButton to JPanel
	    	 panel.add(deconnecte) ; 
	         
	    	 
	    	 
	    	 
	         
	         //Principal JPanel
	         JPanel general = new JPanel() ; 
	         //Add Panel1 to General 
	         general.add(panel) ; 
	    	 
	         //Parameter JFrame
	         f.getContentPane().add(general) ; 
	    	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	    	 f.pack() ; 
	    	 f.setVisible(true) ; 
	     }
	     
	     public static void main(String[] args){
	    	 javax.swing.SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					new MyFrame() ; 
					
				}
			});
	     }
}
