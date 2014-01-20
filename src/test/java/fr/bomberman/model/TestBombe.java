package ObjetJeu;

import org.junit.Test;

public class TestBombe
{
	
	//Constructeurs
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeur1() {
		Bomb b = new Bomb(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeur2() {
		Bomb b = new Bomb("");
	}
	
	@Test
	public void testConstructeur3() {
		Bomb b = new Bomb(Model m);
	}
	
	//Methodes
	
	@Test
	public void testDestructionEvironnement() {
		
		Bomb b = new Bomb(Model m);
	}
	

}
