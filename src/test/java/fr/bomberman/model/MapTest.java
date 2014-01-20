package fr.bomberman.model;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class MapTest 
{
	private Carte m;
	
	@Before
	public void constructeur()
	{
		this.m = new Carte();
	}

	
	@Test
	public void bombDestruction()
	{
		Bombe b = new Bombe();
		b.setPortee(X);
		b.setCoor(X,Y);
		AssertEquals
	}
}
