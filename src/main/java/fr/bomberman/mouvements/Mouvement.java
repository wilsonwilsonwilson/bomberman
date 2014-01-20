package fr.bomberman.mouvements;

public class Mouvement 
{
	// Les quatres mouvements disponibles du jeu :
	public final static Mouvement LEFT = new Mouvement(-1,0);
	public final static Mouvement RIGHT = new Mouvement(1,0);
	public final static Mouvement TOP = new Mouvement(0,-1);
	public final static Mouvement BOTTOM = new Mouvement(0,1);
	
	// Tableau comportant l'ensembles des quatres mouvements :
	public final static Mouvement[] MOUVEMENTS = {LEFT,RIGHT,TOP,BOTTOM};
	
	/**
	 * variation abscisse du mouvement
	 */
	private int x;
	
	/**
	 * variation ordonnée du mouvement
	 */
	private int y;
	
	/**
	 * Contructeur privé
	 * @param x, variation abscisse du mouvement
	 * @param y, variation ordonnée du mouvement
	 */
	private Mouvement(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
