package agricole;
import java.util.ArrayList;


public class Elevage {
	//D�claration des attributs
	public ArrayList <Volaille>listeVolailles;

	
	//Constructeur
	public Elevage() {
		listeVolailles = new ArrayList<Volaille>();
	}
	
	//M�thode ajouter une volaille
	public void ajouterVolaille(Volaille volaille) {
		if(volaille!=null && !listeVolailles.contains(volaille)) {
			listeVolailles.add(volaille);
		}
	}	
		
	//M�thode pour calculer le prix obtenu
	public double calculPrixAbattage(Volaille volaille) {
		double prixAbattage = 0;
		if(!volaille.verifPoids()) {
			System.out.println("La volaille s�lection�e n'a pas atteint le poids minimum pour �tre abattue\n" + volaille);
		}else {
			prixAbattage = volaille.calculerPrix();
			retirerVolaille(volaille.getMatricule());
		}
		return prixAbattage;
	}
	
	//M�thode pour calculer le prix total d'abattage
	public double calculPrixTotalAbattage() {
		double prixTotalAbattage = 0;
		int [] matriculeAbattage = new int[listeVolailles.size()];
		int i = 0;
		for (Volaille volaille : listeVolailles) {
			if(volaille.verifPoids()) {
				prixTotalAbattage = prixTotalAbattage + volaille.calculerPrix();
				matriculeAbattage[i] = volaille.getMatricule();	
			}
			i++;
		}
		for (int j = 0; j < matriculeAbattage.length; j++) {
			if(matriculeAbattage[j] != 0) {
				retirerVolaille(matriculeAbattage[j]);
			}
		}
		return prixTotalAbattage;
	}
	
	//M�thode pour retirer une volaille pour l'abattage
	public void retirerVolaille(int matricule) {
		int index = 0;
		int tailleListeVolailles = listeVolailles.size();
		while(index < tailleListeVolailles && listeVolailles.get(index).getMatricule() != matricule) {
			index++;
		}
		if(index < tailleListeVolailles) {
			System.out.println("La volaille s�lectionn�e a bien �t� retir�e du listing de l'exploitation.");
			System.out.println(listeVolailles.get(index) + "\n");
			listeVolailles.remove(index);
			Volaille.nombreVolailles--;
			
		}else {
			throw new RuntimeException("La volaille ayant pour matricule: " + matricule + " n'est pas r�pertori�e");
		}
	}
	
	//M�thode pour afficher
	public String toString() {
		String affichage="";
		int tailleListeVolailles = listeVolailles.size();
		System.out.println("Listing des " + Volaille.nombreVolailles + " volailles de l'exploitation: ");
		for (int i = 0; i < tailleListeVolailles; i++) {
			affichage = affichage + listeVolailles.get(i).toString() + "\n";
		}
		return affichage;
	}
}
