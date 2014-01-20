package fr.bomberman.model;

import java.awt.Point;

public class Bomb {


	// Attributs 
	public static char bombe = 'B'; 
	private Carte carte;
	private int porteeRadiation;
	private Point position;
	private Personnage personnage;
	
	public Bomb(Carte carte, Personnage personnage){
		this.porteeRadiation = 2 + personnage.getBonusPortee();
		this.carte = carte;
		this.personnage = personnage;
	}
	
	/**
	 * Destruction de l'environnement de la bombe
	 */
	public void destructionEnvironnement(){
				
				checkLeft();
				checkRight();
				checkBot();
				checkTop();			
		
	}

	private void checkLeft(){
		boolean dBlocksCassable = false;
		for(int i = 1; i <= porteeRadiation; i++){
			if(position.x - i > 0){	
				if((carte.getMap()[position.x - i][position.y] != '.' && carte.getMap()[position.x - i][position.y] != 'X') && dBlocksCassable == false){
					if(carte.getMap()[position.x - i][position.y] == 'O'){
						dBlocksCassable = true;
					}
					carte.setCase(position.x - i, position.y, carte.LIBRE);
				}
			}
		}
	}

	private void checkRight(){
		boolean dBlocksCassable = false;
		for(int i = 1; i <= porteeRadiation; i++){
			if(position.x + i < carte.getSize()){	
				if((carte.getMap()[position.x + i][position.y] != '.' && carte.getMap()[position.x + i][position.y] != 'X') && dBlocksCassable == false){
					if(carte.getMap()[position.x + i][position.y] == 'O'){
						dBlocksCassable = true;
					}
					carte.setCase(position.x + i, position.y, carte.LIBRE);
				}
			}
		}
	}

	private void checkBot(){
		boolean dBlocksCassable = false;
		for(int i = 1; i <= porteeRadiation; i++){
			if(position.y + i < carte.getSize()){
				if((carte.getMap()[position.x][position.y + i] != '.' && carte.getMap()[position.x + i][position.y] != 'X') && dBlocksCassable == false){
					if(carte.getMap()[position.x][position.y + i] == 'O'){
						dBlocksCassable = true;
					}
					carte.setCase(position.x, position.y + i, carte.LIBRE);	
				}
			}
		}
	}

	private void checkTop(){
		boolean dBlocksCassable = false;
		for(int i = 1; i <= porteeRadiation; i++){ 
			if(position.y - i > 0){
				if((carte.getMap()[position.x][position.y - i] != '.' && carte.getMap()[position.x][position.y - i] != 'X') && dBlocksCassable == false){
					if(carte.getMap()[position.x][position.y - i] == 'O'){
						dBlocksCassable = true;
					}
					carte.setCase(position.x, position.y - i, carte.LIBRE);		
				}
			}
		}
	}
	
	public static char getBombe() {
		return bombe;
	}


	public int getPorteeRadiation() {
		return porteeRadiation;
	}

	public void setPorteeRadiation(int porteeRadiation) {
		porteeRadiation = porteeRadiation;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}
}
