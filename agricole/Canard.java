package agricole;

public class Canard extends Volaille {
	//Attributs
	static double prixJour;
	static double poidsAbattage;
	
	//Constructeur
	public Canard(double poids) {
		super(poids);
	}
	
	//Getter & Setter prixKilo
	public double getPrixJour(){
		return prixJour;
	}
	public static void setPrixKilo(double prix) {
		prixJour = prix;
	}
	
	//Getter & Setter poidsAbattage
	public double getPoidsAbattage() {
		return poidsAbattage;
	}
	public static void setPoidsAbattage(double poids) {
		poidsAbattage = poids;
	}
	
	//Méthode pour vérifier si le poids minimal est atteint
	public boolean verifPoids() {
		if(poids >= poidsAbattage) {
			return true;
		}
		return false;
	}
	
	//Méthode pour calculer le prix
	public double calculerPrix() {
		return prixJour * poids;
	}
	
	//Méthode d'affichage
	public String toString() {
		return "Canard N°: " + matricule + " | pesant: " + poids + "kg | Poids d'abattage: " + poidsAbattage + "kg | Prix au kilo: " + prixJour + "€";
	}

}
