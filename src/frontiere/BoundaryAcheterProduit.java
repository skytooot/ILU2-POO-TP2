package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		// TODO à completer
		if(!controlAcheterProduit.verifierIdentite(nomAcheteur)) {
			System.out.println("Je suis d�sol�e "+nomAcheteur+" mais il faut �tre un habitant"
					+" de notre village pour commercer ici.\n");
		}
		else {
			System.out.println("Quel produit voulez-vous acheter ?\n");
			Scanner sc = new Scanner(System.in);
			String produit = sc.nextLine();
			String[] vendeurs = controlAcheterProduit.donnerVendeurProduit(produit);
			if(vendeurs == null) {
				System.out.println("D�sol�, personne ne vend ce produit au march�.\n");
			}
			else {
				StringBuilder question = new StringBuilder("Chez quel commer�ant voulez-vous acheter des "+produit+"?\n");
				for(int i =0;i<vendeurs.length;i++) {
					question.append((i+1)+" - "+vendeurs[i]+"\n");
				}
				int numVendeur = Clavier.entrerEntier(question.toString());
				while(numVendeur <1 | numVendeur>vendeurs.length) {
					System.out.println("Vous devez choisir un nombre entre 1 et "+vendeurs.length);
					numVendeur = Clavier.entrerEntier(question.toString());
				}
				System.out.println(nomAcheteur+" se d�place jusqu'� l'�tal du vendeur "+vendeurs[numVendeur-1]);
				StringBuilder combien = new StringBuilder("Bonjour "+nomAcheteur+"\nCombien de "+produit+
						" voulez-vous acheter ?\n");
				int quantite = Clavier.entrerEntier(combien.toString());
				int vendu = controlAcheterProduit.acheterProduit(vendeurs[numVendeur-1], quantite);
				if(vendu == 0 &&quantite!=0) {
					System.out.println(nomAcheteur+" veut acheter "+quantite+" "+produit+
							", malheureusement il n'y en a plus !\n");
				}
				else if(vendu < quantite) {
					System.out.println(nomAcheteur+" veut acheter "+quantite+" "+produit+
							", malheureusement "+vendeurs[numVendeur-1]+" n'en a plus que "+vendu+
							". "+nomAcheteur+" ach�te tout le stock de "+vendeurs[numVendeur-1]+"\n");
				}
				else {
					System.out.println(nomAcheteur+" ach�te "+vendu+" "+produit+" � "+vendeurs[numVendeur-1]+"\n");
				}
				
			}
			
		}
	}
}
