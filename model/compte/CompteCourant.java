package model.compte;

import model.Carte;

public class CompteCourant extends Compte {
	
	/**
	 * plafond du découvert autorisé par la banque
	 */
	private int decouvert;
	
	private Carte carte;
	
	public CompteCourant() {
		
	}

}
