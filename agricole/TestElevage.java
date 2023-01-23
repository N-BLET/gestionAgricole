package agricole;

public class TestElevage {

	public static void main(String[] args) {
		//Création de 3 poulets
		Poulet poulet1 = new Poulet(3.25);
		Poulet poulet2 = new Poulet(5.5);
		Poulet poulet3 = new Poulet(4.5);
		
		
		//Création de 3 canards
		Canard canard1 = new Canard(2.75);
		Canard canard2 = new Canard(6);
		Canard canard3 = new Canard(4.6);
				
		//Création de la liste des volailles
		Elevage liste;
		liste = new Elevage();
				
		//Ajout des 6 volailles à la liste
		liste.ajouterVolaille(poulet1);
		liste.ajouterVolaille(poulet2);
		liste.ajouterVolaille(poulet3);
		liste.ajouterVolaille(canard1);
		liste.ajouterVolaille(canard2);
		liste.ajouterVolaille(canard3);
				
		//Mise à jour du Prix au kilo et du poids d'abattage des poulets
		Poulet.setPrixJour(8.5);
		Poulet.setPoidsAbattage(4.5);
		
		//Mise à jour du Prix au kilo et du poids d'abattage des canards
		Canard.setPrixKilo(10.5);
		Canard.setPoidsAbattage(5.5);
		
		//Affichage de la liste des volailles
		System.out.println(liste);
		
		//Retrait d'une volaille
		liste.retirerVolaille(1);
		System.out.println(liste);
		
		//Calcul des recettes après abattage d'une volaille
		System.out.println("Recette suite à l'abattage: " + liste.calculPrixAbattage(canard1) + "€\n");
		System.out.println(liste);
		
		
		System.out.println("Recette suite à l'abattage: " + liste.calculPrixAbattage(poulet2) + "€\n");
		System.out.println(liste);
		
		//Calcul des recettes après abattage de plusieurs volailles
		System.out.println("Recette totale suite à l'abattage: " + liste.calculPrixTotalAbattage() + "€\n");
		System.out.println(liste);
	}

}
