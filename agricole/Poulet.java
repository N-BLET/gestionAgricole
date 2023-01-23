package agricole;

public class Poulet extends Volaille{
	//Attributs
	static double prixJour = 7.5;
	static double poidsAbattage = 3.5;
	
	
	
	//Constructeur
	public Poulet(double poids) {
		super(poids);
	}
	
	//Getter & Setter prixKilo
	public double getPrixJour(){
		return prixJour;
	}
	public static void setPrixJour(double prix) {
		prixJour = prix;
	}
	
	//Getter & Setter poidsAbattage
	public double getPoidsAbattage() {
		return poidsAbattage;
	}
	public static void setPoidsAbattage(double poids) {
		poidsAbattage= poids;
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
		return "Poulet N°: " + matricule + " | pesant: " + poids + "kg | Poids d'abattage: " + poidsAbattage + "kg | Prix au kilo: " + prixJour + "€";
	}
}
