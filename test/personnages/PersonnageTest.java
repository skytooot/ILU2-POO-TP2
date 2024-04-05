package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonnageTest {
	private Personnage benoit;
	
	@BeforeEach
	public void initialiserSituation() {
		benoit = new Personnage("Benoit",10);
	}
	
	/*
	@Test
	void testPersonnage() {
		Personnage frank = new Personnage("Frank",0);
	}*/
	
	@Test
	void testGetForce() {
		assertEquals(10,benoit.getForce());
	}
	
	@Test
	void testPrendreParole() {
		assertNotNull(benoit.prendreParole());
	}
	
	@Test
	void testToString() {
		assertNotNull(benoit.toString());
	}

}
