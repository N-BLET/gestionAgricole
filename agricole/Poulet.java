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
	
	//M�thode pour v�rifier si le poids minimal est atteint
	public boolean verifPoids() {
		if(poids >= poidsAbattage) {
			return true;
		}
		return false;
	}
	
	//M�thode pour calculer le prix
	public double calculerPrix() {
		return prixJour * poids;
	}
	
	//M�thode d'affichage
	public String toString() {
		return "Poulet N�: " + matricule + " | pesant: " + poids + "kg | Poids d'abattage: " + poidsAbattage + "kg | Prix au kilo: " + prixJour + "�";
	}
}
