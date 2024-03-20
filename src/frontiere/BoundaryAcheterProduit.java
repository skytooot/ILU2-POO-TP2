package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}
	
	//pas ouf
	public void acheterProduit(String nomAcheteur) {
		// TODO Ã  completer
		if(!controlAcheterProduit.verifierIdentite(nomAcheteur)) {
			System.out.println("Seul les habitants du village peuvent acheter au marché\n");
		}
		else {
			System.out.println("Quel produit voulez-vous acheter ?\n");
			Scanner sc = new Scanner(System.in);
			String produit = sc.nextLine();
			String[] infosMarche = controlAcheterProduit.donnerInfosMarche();
			System.out.println("Chez quel commerçant voulez_vous acheter des "+produit+" ?\n");
			for(int i =0;i<infosMarche.length;i++) {
				if(infosMarche[i+2] == produit) {
					System.out.println(());
				}
				else {
					i+=2;
				}
			}
		}
	}
}
