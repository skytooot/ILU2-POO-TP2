package personnages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class ChefTest {
	private Village village;
	private Chef abraracourcix;

	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}
	
	@Test
	void testParler() {
		abraracourcix.parler("bonjour");
	}
	
	@Test
	void testPrendreParole() {
		String message = "Le chef Abraracourcix du village le village des irréductibles : ";
		assertEquals(message,abraracourcix.prendreParole());
	}

}
