import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class MyFrame {

	
	     public MyFrame(){
	    	 JFrame f = new JFrame("Absents") ;
	    	 JPanel panel = new JPanel(); 
	    	 panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS)) ; 
	    	 //TextField Search
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
	    	 
	    	 //Button Before
	    	 JButton before = new JButton(new ImageIcon("images/precedent.png"));
	    	 before.setBackground(Color.WHITE); 
	    	 before.setBorderPainted(false); 
	    	 //Image_Student
	    	  JLabel student = new JLabel(); 
	    	  student.setIcon(new ImageIcon("images/tete2.png")) ;
	    	  student.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    	
	    	 //Button After
	    	 JButton after = new JButton(new ImageIcon("images/suivant.png"));
	    	 after.setBackground(Color.WHITE); 
	    	 after.setBorderPainted(false); 
	    	 
	    	//JPanel2
	    	 JPanel panel2 = new JPanel() ;
	    	 panel2.setBackground(Color.WHITE);
	    	 panel2.setLayout(new BoxLayout(panel2, BoxLayout.LINE_AXIS)); 
	    	 panel2.add(before); 
	    	 panel2.add(student); 
	    	 panel2.add(after); 
	    	 panel2.setBorder(new EmptyBorder(20, 0, 0, 0));
	    	 
	    	//JPANEL NAME
	    	 JPanel panel3 = new JPanel();
	    	 panel3.setBackground(Color.WHITE); 
	    	 panel3.setLayout(new BoxLayout(panel3, BoxLayout.LINE_AXIS));
	    	 JLabel name = new JLabel("Jean Kevin") ;
	    	 name.setFont(new Font("Arial",Font.PLAIN, 20)); 
	    	 panel3.add(name); 
	    	 panel3.setBorder(new EmptyBorder(20, 0, 0, 0));
	    	 
	    	//JPANEL Notification
	    	 JPanel panel4 = new JPanel() ; 
	    	 panel4.setBackground(Color.WHITE);
	    	 panel4.setLayout(new BoxLayout(panel4, BoxLayout.LINE_AXIS));
	    	 panel4.setBorder(new EmptyBorder(10, 0, 0, 0));
	    	//JLabel absent = new JLabel("Absent"); 
	    	 JRadioButton absent = new JRadioButton("Absent"); 
	    	 JRadioButton retard = new JRadioButton("Retard"); 
	    	 absent.setBackground(Color.WHITE);
	    	 retard.setBackground(Color.WHITE); 
	    	 ButtonGroup grp = new ButtonGroup() ; 
	    	 grp.add(absent); 
	    	 grp.add(retard); 
	    	 panel4.add(absent); 
	    	 panel4.add(retard); 
	    	 absent.setFont(new Font("Arial", Font.PLAIN, 23)); 
	    	 retard.setFont(new Font("Arial", Font.PLAIN, 23)); 
	    	 
	    	 //JPANEL5 & LABEL
	    	 JPanel panel5 = new JPanel();
	    	 panel5.setBackground(Color.WHITE);
	    	 panel5.setLayout(new BoxLayout(panel5, BoxLayout.LINE_AXIS));
	    	 JLabel labelabsence = new JLabel("nbr Absence: 3");
	    	 labelabsence.setFont(new Font("Arial", Font.PLAIN, 12));
	    	 labelabsence.setBorder(new EmptyBorder(0, 0, 0, 20));
	    	 JLabel labelretard = new JLabel("nbr Retard: 8");
	    	 labelretard.setFont(new Font("Arial", Font.PLAIN, 12));
	    	 panel5.add(labelabsence); 
	    	 panel5.add(labelretard); 
	         //JPANEL6 COMMENTAIRE
	    	 JPanel panel6 = new JPanel() ;
	    	 panel6.setBackground(Color.WHITE); 
	    	 panel5.setLayout(new BoxLayout(panel5, BoxLayout.LINE_AXIS));
	    	 JTextArea commentaire = new JTextArea("Commentaire") ; 
	    	 commentaire.setPreferredSize(new Dimension(200,100));
	    	 commentaire.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
	    	 commentaire.setFont(new Font("Arial", Font.PLAIN, 15));
	    	 panel6.add(commentaire) ;
	    	 //JPANEL FOOTER
	    	 JPanel panel7 = new JPanel() ; 
	    	 panel7.setLayout(new BoxLayout(panel7, BoxLayout.LINE_AXIS)); 
	    	 panel7.setPreferredSize(new Dimension(f.getContentPane().getWidth(),20));
	    	 panel7.setBackground(Color.WHITE); 
	    	 JLabel cour = new JLabel("Cours d'IHM du 03/Juin/2015 08:32");
	    	 cour.setBackground(Color.WHITE);
	    	 panel7.setBorder(new EmptyBorder(0,0,10,0));
	         JPanel panel8 = new JPanel();
	         panel8.setLayout(new BoxLayout(panel8, BoxLayout.LINE_AXIS)); 
	    	 JButton envoyer = new JButton("Envoyer"); 
	    	 envoyer.setBorder(new EmptyBorder(0,0,0,15)); 
	    	 JButton modifier= new JButton("Modifier"); 
	    	 panel7.add(cour);
	    	 panel8.add(envoyer); 
	    	 
	    	 panel8.add(modifier); 
	    	 
	         //Principal JPanel
	         JPanel general = new JPanel() ;
	         general.setLayout(new BoxLayout(general, BoxLayout.PAGE_AXIS));
	         //Add Panel1 to General 
	         general.setBackground(Color.WHITE);
	         general.add(panel) ;
	         general.add(panel2); 
	         general.add(panel3); 
	    	 general.add(panel4);
	    	 general.add(panel5); 
	    	 general.add(panel6);
	    	 general.add(panel7); 
	    	 general.add(panel8); 
	         //Parameter JFrame
	         //f.setPreferredSize(new Dimension(320,480));
	         
	         f.getContentPane().add(general) ; 
	    	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	    	 f.pack() ; 
	    	 f.setVisible(true) ; 
	     }
	     
	     /*public static void main(String[] args){
	    	 javax.swing.SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					new MyFrame() ; 
					
				}
			});
	     }*/
}
