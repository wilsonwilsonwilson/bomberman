package fr.bomberman.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBomb
{
	//Constructeurs (Carte, Personnage)
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeur1() {
		Personnage p = new Personnage(new Model(), 4, 6);
		Bomb b = new Bomb(null, p);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeur2() {
		Personnage p = new Personnage(new Model(), 4, 6);
		Carte c = new Carte();
		Bomb b = new Bomb(c, null);
	}
	
	@Test
	public void testConstructeur3() {
		Personnage p = new Personnage(new Model(), 4, 6);
		Carte c = new Carte();
		Bomb b = new Bomb(c, p);
	}
}
