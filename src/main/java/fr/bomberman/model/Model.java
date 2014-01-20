package fr.bomberman.model;

import java.util.ArrayList;

import fr.bomberman.mouvements.Mouvement;

public class Model {

	private Carte  map;
	ArrayList<Personnage> joueurs;
	
	
	// en cas de génération d'une nouvelle map avec les mêmes joueurs
	public Model(Carte map, ArrayList<Personnage> joueur) {
		super();
		this.map = map;
		this.joueurs = joueur;
	}
	

	//initialise un model de base
	public Model() {
		super();
		this.map = new Carte();
		this.joueurs = new ArrayList<Personnage>();
	}

	// test si le mouvement est correcte et le réalise
	public void move (Mouvement mvt, Personnage j){
	}
	
	public void addJoueur(Personnage player){
		this.joueurs.add(player);
	}


	public ArrayList<Personnage> getJoueur() {
		return joueurs;
	}


	public void setJoueur(ArrayList<Personnage> joueur) {
		this.joueurs = joueur;
	}


	public void setMap(Carte map) {
		this.map = map;
	}


	public Carte getMap() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
