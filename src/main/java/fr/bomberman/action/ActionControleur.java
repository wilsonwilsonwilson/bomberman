package fr.bomberman.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.bomberman.model.Model;
import fr.bomberman.model.Personnage;

public class ActionControleur implements KeyListener{

	Model modele;
	Personnage personnage;
	public ActionControleur(Model m, Personnage p){
		modele = m;
		personnage = p;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if ( e.equals(KeyEvent.VK_DOWN)){
			
		}
		if ( e.equals(KeyEvent.VK_UP)){
			
		}
		if ( e.equals(KeyEvent.VK_LEFT)){
			
		}
		if ( e.equals(KeyEvent.VK_RIGHT)){
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}