package controller.baseDeDonnees;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.MySql;

	public class BdDCompte {
	
		MySql bdd= null;
	
	/**
	 * crée un objet MySql avec en paramètres l'identifiant, le mot de passe et l'adresse de connexion
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
	 * créer un compte
	 * @param requete : requête de création de compte
	 */
	public void creerCompteBDD(String requete) {
		
	}
	
	/**
	 * mise à jour du solde du compte
	 * @param requete : requête de modification du solde du compte
	 */
	public void modifierSoldeCompteBDD(String requete) {
		
	}
	
	/**
	 * supprimer un compte
	 * @param requete : requête de suppression compte
	 */
	public void supprimerCompteBDD(String requete) {
		
	}
	
	/**
	 * créer une carte
	 * @param requete : requête de création carte
	 */
	public void creationCarteBDD(String requete) {

	}

}
