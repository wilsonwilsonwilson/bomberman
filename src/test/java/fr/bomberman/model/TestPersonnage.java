package fr.bomberman.model;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestPersonnage {
	Personnage p;
	@Before
	public void setUp(){
		p = new Personnage(new Model(), 4, 6);
	}
	
	public void test_nouveau_personnage_en_1(){
		// Given 
		Model model = new Model();
		Personnage personnage = new Personnage(model, 1, 1);
		Assert.assertEquals(1,personnage.getPosition().getX());
	}
	
	@Test
	public void test_nouveau_personnage_nombre_de_vie_a_3(){
		// Given 
		Model model = new Model();
		Personnage personnage = new Personnage(model, 1, 1);
		Assert.assertEquals(3,personnage.getNbVie());
	}
}
