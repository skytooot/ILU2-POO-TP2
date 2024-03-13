package controleur;

import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public Etal trouverEtalVendeur(String nomVendeur) {
		//TODO a completer
		Etal etal = null;
		if(village.trouverHabitant(nomVendeur)!=null) {
			etal = village.rechercherEtal(village.trouverHabitant(nomVendeur));
		}
		
		return etal;
	}
}
