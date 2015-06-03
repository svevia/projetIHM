import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class FrameConnexion {

	public FrameConnexion(){
		final JFrame f = new JFrame("Connexion") ;
	   	JPanel panel = new JPanel(); 
	   	panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS)) ; 
		
	   	//Application name
	   	JLabel name = new JLabel("Application sans nom");
	   	name.setFont(new Font("Arial",Font.PLAIN, 20));
	   //panel title
	   	panel.add(name);
	   	panel.setBorder(new EmptyBorder(0, 15, 0, 15));
	   	
	   	
	   	
	   //label Connexion	
	   	JPanel panel2 = new JPanel(); 
		
	   	//Application name
	   	JLabel connexion = new JLabel("Connexion");
	   	connexion.setFont(new Font("Arial",Font.BOLD, 35));
	   	panel2.setBorder(new EmptyBorder(30, 0, 30, 0));
	   //panel title
	   	panel2.add(connexion);
	   	
	   	
	   	
		 //label Username	
	   	JPanel panel3 = new JPanel(); 
		
	   	//username textField
	   	JLabel username = new JLabel("Nom");
	   	username.setFont(new Font("Arial",Font.PLAIN, 15));
	   	username.setBorder(new EmptyBorder(0, 0, 0, 65));
	   	
	   	JTextField fieldName = new JTextField("Username",10);
	   //panel username
	   	panel3.add(username);
	   	panel3.add(fieldName);
	   	
	   	
		 //label password	
	   	JPanel panel4 = new JPanel(); 
		
	   	//Password textField
	   	JLabel password = new JLabel("Mot de passe");
	   	password.setFont(new Font("Arial",Font.PLAIN, 15));
	   	
	   	JTextField fieldPass = new JTextField("***********",10);
	   //panel password
	   	panel4.add(password);
	   	panel4.add(fieldPass);
	   	

		 //button connect	
	   	JPanel panel5 = new JPanel(); 
		
	   	//button connexion
	   	JButton connecte = new JButton("Valider");
	   	connecte.addMouseListener(new MouseAdapter() {
	   		
	   		public void mousePressed(java.awt.event.MouseEvent e) {
	   			f.getContentPane().removeAll();
	   			javax.swing.SwingUtilities.invokeLater(new Runnable() {
	   				
	   				@Override
	   				public void run() {
	   					new MyFrame() ; 
	   				}
	   			});
	   	    }
	   	});
	   //panel button
	   	panel5.setBorder(new EmptyBorder(10, 0, 0, 0));
	   	panel5.add(connecte);

	   	
	   	
	   	JPanel panel6 = new JPanel(); 
	   	//IUT image
  	  JLabel logo = new JLabel(); 
  	  logo.setIcon(new ImageIcon("images/logo.png")) ;
	   	
	   	panel6.setBorder(new EmptyBorder(10, 0, 10, 0));
	   	panel6.add(logo);
	   	
	   	
	   	
	   	
	   	JPanel general = new JPanel() ;
	    general.setLayout(new BoxLayout(general, BoxLayout.PAGE_AXIS));
	    //Add Panel to General 
	    general.setBackground(Color.WHITE);
	    general.add(panel) ;
	    panel.setBackground(Color.WHITE);
	    general.add(panel2);
	    panel2.setBackground(Color.WHITE);
	    general.add(panel3);
	    panel3.setBackground(Color.WHITE);
	    general.add(panel4);
	    panel4.setBackground(Color.WHITE);
	    general.add(panel5);
	    panel5.setBackground(Color.WHITE);
	    general.add(panel6);
	    panel6.setBackground(Color.WHITE);

	    //Parameter JFrame
	    f.setPreferredSize(new Dimension(280,480));
	    
	    f.getContentPane().add(general) ; 
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		 f.pack() ; 
		 f.setVisible(true) ; 
	}
	
    public static void main(String[] args){
   	 javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new FrameConnexion() ; 
				
			}
		});
    }
}
