package controller.baseDeDonnees;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.MySql;

	public class BdDCompte {
	
		MySql bdd= null;
	
	/**
	 * cr�e un objet MySql avec en param�tres l'identifiant, le mot de passe et l'adresse de connexion
	 */
	public BdDCompte() {
		bdd=new MySql("root", "nicolas", "jdbc:mysql://localhost/test");
		
	}
		
	/**
	 * lire les informations du compte
	 * @param requete : lire les informations du compte
	 */
	public void lireCompteBDD(String requete) {
	
	}
	
	/**
	 * cr�er un compte
	 * @param requete : requ�te de cr�ation de compte
	 */
	public void creerCompteBDD(String requete) {
		
	}
	
	/**
	 * mise � jour du solde du compte
	 * @param requete : requ�te de modification du solde du compte
	 */
	public void modifierSoldeCompteBDD(String requete) {
		
	}
	
	/**
	 * supprimer un compte
	 * @param requete : requ�te de suppression compte
	 */
	public void supprimerCompteBDD(String requete) {
		
	}
	
	/**
	 * cr�er une carte
	 * @param requete : requ�te de cr�ation carte
	 */
	public void creationCarteBDD(String requete) {

	}

}
