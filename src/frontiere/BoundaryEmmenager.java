package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous Ãªtes déjà  un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("ÃŠtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					System.out.println("Bienvenue villageois "+nomVisiteur+"\n");
					StringBuilder questionForce = new StringBuilder();
					questionForce.append("Quelle est votre force ? \n");
					int force = 0;
					force = Clavier.entrerEntier(questionForce.toString());
					controlEmmenager.ajouterGaulois(nomVisiteur ,force);
					//TODO a completer
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		System.out.println("Bienvenue druide "+nomVisiteur+"\n");
		StringBuilder questionForce = new StringBuilder();
		questionForce.append("Quelle est votre force ? \n");
		int force = 0;
		force = Clavier.entrerEntier(questionForce.toString());
		int effePotionMin = 0;
		int effePotionMax = -1;
		StringBuilder questionMin = new StringBuilder();
		questionMin.append("Quelle est la force de potion la plus faible que vous produisez ?\n");
		StringBuilder questionMax = new StringBuilder();
		questionMax.append("Quelle est la force de potion la plus faible que vous produisez ?\n");
		while(effePotionMax < effePotionMin) {
			effePotionMin = Clavier.entrerEntier(questionMin.toString());
			effePotionMax = Clavier.entrerEntier(questionMax.toString());
			if(effePotionMax < effePotionMin) {
				System.out.println("Attention Druide, vous vous êtes trompé entre le minimum et le maximum\n");
			}
		}
		
		controlEmmenager.ajouterDruide(nomVisiteur ,force,effePotionMin,effePotionMax);
		//TODO a completer
	}
}
