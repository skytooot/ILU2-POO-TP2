package controleur;

import villagegaulois.Village;
import personnages.Gaulois;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	//TODO a completer
	public boolean verifierIdentite(String nomAcheteur) {
		return controlVerifierIdentite.verifierIdentite(nomAcheteur);
	}
	//pas ouf
	public String[] donnerInfosMarche() {
		return village.donnerEtatMarche();
	}
	
	
	//pas ouf
	public String afficherVendeurProduit(String produit) {
		StringBuilder texte = new StringBuilder();
		Gaulois[] listeVendeur = village.rechercherVendeursProduit(produit);
		if(listeVendeur == null) {
			texte.append("Désolé mais aucun vendeur ne vend de "+produit+"...\n");
		}
		else {
			texte.append("Chez quel commerçant voulez-vous acheter des "+produit+" ?\n");
			for(int i =0; i<listeVendeur.length;i++) {
				texte.append((i+1)+" - "+listeVendeur[i].getNom());
			}
		}
		return texte.toString();
	}
	//pas ouf
	public int acheterProduit(String nomVendeur, int nbAAcheter) {
		if(controlVerifierIdentite.verifierIdentite(nomVendeur)) {
			return 0;
		}
		else {
			return 0;
		}
		
	}
	
}
