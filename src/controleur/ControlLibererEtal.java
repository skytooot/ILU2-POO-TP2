package controleur;

import villagegaulois.Etal;
import villagegaulois.Village;
import controleur.ControlTrouverEtalVendeur;

public class ControlLibererEtal {
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;

	public ControlLibererEtal(
			ControlTrouverEtalVendeur controlTrouverEtalVendeur) {
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	//TODO a completer

	public boolean isVendeur(String nomVendeur) {
		return controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur) != null;
	}
	
	
	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
	 *         vendu [3] : quantité de produit à vendre au début du marché [4] :
	 *         quantité de produit vendu
	 */
	public String[] libererEtal(String nomVendeur) {
		//TODO a completer
		Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		if(etal == null) {
			return null;
		}
		else {
			String[] donneesEtal = etal.etatEtal();
			etal.libererEtal();
			return donneesEtal;
		}
	}

}
