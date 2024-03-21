package controleur;

import villagegaulois.Village;
import personnages.Gaulois;
import villagegaulois.Etal;

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
	
	public String[] donnerVendeurProduit(String produit) {
		Gaulois[] tabGaulois = village.rechercherVendeursProduit(produit);
		if(tabGaulois != null) {
			String[] str = new String[tabGaulois.length];
			for(int i=0; i<tabGaulois.length;i++) {
				str[i] = tabGaulois[i].getNom();
				//System.out.println(str[i]+"\n");
			}
			return str;
		}
		//faire un tableau avec le nom des vendeurs qui vendent le produit
		//puis plus tard faire en sorte de retrouver les étals via le nom des vendeurs du tableau
		return null;
	}
	
	
	public int acheterProduit(String nomVendeur, int nbAAcheter) {
		int nbVendu = 0;
		Etal etal  = village.rechercherEtal(village.trouverHabitant(nomVendeur));
		nbVendu = etal.acheterProduit(nbAAcheter);
		return nbVendu;
	}
	
	
}
