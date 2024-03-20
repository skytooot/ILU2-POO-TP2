package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		//TODO a completer
		if(!controlPrendreEtal.verifierIdentite(nomVendeur)) {
			System.out.println("Je suis désolée "+nomVendeur
					+" mais il faut être un habitant de notre village pour commercer ici.\n");
		}
		else {
			System.out.println("Bonjour "+nomVendeur+
					", je vais regarder si je peux vous trouver un étal.\n");
			if(!controlPrendreEtal.resteEtals()) {
				System.out.println("Désolé "+nomVendeur+
						" je n'ai plus d'étal qui ne soit pas déjà occupé.\n");
			}
			else {
				installerVendeur(nomVendeur);
				
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
		System.out.println("C'est parfait, il me reste un étal pour vous !\n"+
				"Il me faudrait quelques renseignements :");
		//StringBuilder questionQuoi = new StringBuilder();
		//questionQuoi.append("Quel produit souhaitez-vous vendre ? \n");
		System.out.println("Quel produit souhaitez-vous vendre ? \n");
		Scanner sc = new Scanner(System.in);
		String produit = sc.nextLine();
		//StringBuilder produit = new StringBuilder(Clavier.entrerEntier(questionQuoi.toString()));
		StringBuilder questionCombien = new StringBuilder();
		questionCombien.append("Combien souhaitez-vous en vendre ? \n");
		int quantite = Clavier.entrerEntier(questionCombien.toString());
		
		int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit.toString(), quantite);
		if(numeroEtal != -1) {
			System.out.println("La vendeur "+nomVendeur+" s'est installé à l'étal n°"+(numeroEtal+1));
		}
	}
}
