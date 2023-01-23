package agricole;


public class Volaille {
	//Attributs
	protected double poids;
	protected int matricule;
	private static int prochain_numero = 1;
	public static int nombreVolailles = 0;
	
	//Constructeur
	public Volaille(double poids) {
		this.poids = poids;
		matricule = Volaille.prochain_numero;
		Volaille.prochain_numero = Volaille.prochain_numero + 1;
		nombreVolailles++;
	}
	
	//Getter & Setter poids
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	//Getter matricule
	public int getMatricule() {
		return matricule;
	}	
	
	//M�thode pour v�rifier le poids de l'animal
	public boolean verifPoids() {
		return false;
	}
	
	//M�thode pour calculer le prix de l'animal apr�s abattage
	public double calculerPrix() {
		return 0.0;
	}
	
	
}
