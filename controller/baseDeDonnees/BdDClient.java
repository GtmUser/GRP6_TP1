package controller.baseDeDonnees;

import java.sql.ResultSet;

import model.MySql;

public class BdDClient {	
		
		MySql bdd= null;
	
	/**
	 * cr�e un objet MySql avec en param�tres l'identifiant, le mot de passe et l'adresse de connexion
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
	 * cr�er un client
	 * @param requete : requ�te de cr�ation de client
	 */
	public void creerClientBDD(String requete) {
		
	}
	
	/**
	 * mise � jour des informations du client
	 * @param requete : requ�te de modification des informations du client
	 */
	public void modifierInfoClientBDD(String requete) {
		
	}
	
	/**
	 * supprimer un client
	 * @param requete : requ�te de suppression client
	 */
	public void supprimerClientBDD(String requete) {
		
	}

}
