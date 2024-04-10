package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GauloisTest {
	private Gaulois benoit;
	
	@BeforeEach
	public void initialiserSituation() {
		benoit = new Gaulois("Benoit",10);
	}
	
	
	@Test
	void testBoirePotion() {
		benoit.boirePotion(5);
		assertEquals(50,benoit.getForce());
	}
	
	@Test
	void testPrendreParole() {
		String message = "Le gaulois Benoit : ";
		assertEquals(message,benoit.prendreParole());
	}
	
	@Test
	void testToString() {
		String message = "Gaulois [nom=Benoit, force=10, effetPotion=1]";
		assertEquals(message,benoit.toString());
	}

}
