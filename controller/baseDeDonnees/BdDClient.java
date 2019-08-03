package controller.baseDeDonnees;

import java.sql.ResultSet;

import model.MySql;

public class BdDClient {	
		
		MySql bdd= null;
	
	/**
	 * crée un objet MySql avec en paramètres l'identifiant, le mot de passe et l'adresse de connexion
	 */
	public BdDClient() {
		bdd=new MySql("root", "nicolas", "jdbc:mysql://localhost/test");
		
	}
		
	/**
	 * lire les informations du client
	 * @param requete : lire les informations du client
	 */
	public void lireClientBDD(String requete) {
	
	}
	
	/**
	 * créer un client
	 * @param requete : requête de création de client
	 */
	public void creerClientBDD(String requete) {
		
	}
	
	/**
	 * mise à jour des informations du client
	 * @param requete : requête de modification des informations du client
	 */
	public void modifierInfoClientBDD(String requete) {
		
	}
	
	/**
	 * supprimer un client
	 * @param requete : requête de suppression client
	 */
	public void supprimerClientBDD(String requete) {
		
	}

}
