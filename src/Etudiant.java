import javax.swing.ImageIcon;


public class Etudiant {
	private String nom;
	private boolean absent;
	private boolean retard;
	private ImageIcon image;
	private int nbrAbsent;
	private int nbrRetard;
	private String commentaire;
	
	public Etudiant(String nom,ImageIcon iamges) {
		this.nom = nom;
		this.image = iamges;
		absent = false;
		retard = false;
		nbrAbsent = 0;
		nbrRetard = 0;
		commentaire = "commentaire";
	}

	public int getNbrAbsent() {
		return nbrAbsent;
	}
	
	public boolean isAbsent(){
		return absent;
	}
	
	public boolean isRetard(){
		return retard;
	}

	public void setNbrAbsent(int nbrAbsent) {
		this.nbrAbsent = nbrAbsent;
	}

	public int getNbrRetard() {
		return nbrRetard;
	}

	public void setNbrRetard(int nbrRetard) {
		this.nbrRetard = nbrRetard;
	}

	public ImageIcon getImage(){
		return this.image;
	}
	
	public String getCommentaire(){
		return this.commentaire;
	}
	
	public void setCommentaire(String com){
		this.commentaire = com;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void Absent(){
		absent = true;
	}
	
	public void Retard(){
		retard = true;
	}
	
	
	
}
