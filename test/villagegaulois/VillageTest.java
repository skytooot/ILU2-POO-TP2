package villagegaulois;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controleur.ControlEmmenager;
import personnages.Chef;

class VillageTest {
	private Village village;
	private Chef abraracourcix;
	private ControlEmmenager controlEmmenager;

	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 1);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
		controlEmmenager = new ControlEmmenager(village);
		
	}
	
	@Test
	void testTrouverHabitant() {
		assertNotNull(village.trouverHabitant("Abraracourcix"));
		assertNull(village.trouverHabitant("Bonemine"));
		controlEmmenager.ajouterGaulois("Bonemine", 10);
		assertNotNull(village.trouverHabitant("Bonemine"));
	}
	
	@Test
	void testRechercherEtalVide() {
		assertTrue(village.rechercherEtalVide());
		village.installerVendeur(abraracourcix, "patate", 4);
		assertFalse(village.rechercherEtalVide());
	}
	
	@Test
	void testPartirVendeur() {
		village.installerVendeur(abraracourcix, "patate", 4);
		village.partirVendeur(abraracourcix);

	}
	

}
