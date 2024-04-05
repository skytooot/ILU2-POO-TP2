package personnages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DruideTest {
	private Druide druide;
	
	@BeforeEach
	public void initialiserSituation() {
		druide = new Druide("Panoramix",10,2,5);
	}
	
	@Test
	void testPreparerPotion() {
		Druide superDruide = new Druide("Jean",10,20,30);
		druide.preparerPotion();
		superDruide.preparerPotion();
		
	}
	
	@Test
	void testBooster() {
		Gaulois benoit = new Gaulois("Benoit",10);
		Gaulois obelix = new Gaulois("Obélix",10);
		druide.preparerPotion();
		druide.booster(benoit);
		boolean plop = benoit.getForce()>10;
		assertTrue(plop);
		druide.booster(obelix);
		assertEquals(10,obelix.getForce());
	}
	
	

}
