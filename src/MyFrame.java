import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame {

	
	     public MyFrame(){
	    	 JFrame f = new JFrame("Connexion") ;
	    	 JPanel panel = new JPanel(); 
	    	 panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS)) ; 
	    	 JTextField recherche = new JTextField(20) ; 
	    	 panel.add(recherche) ;
	    	 JButton deconnecte = new JButton(new ImageIcon("images/power.png")) ; 
	         panel.add(deconnecte) ; 
	    	 
	    	 
	    	 
	    	 f.getContentPane().add(panel) ; 
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
