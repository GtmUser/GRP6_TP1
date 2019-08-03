package controller.baseDeDonnees;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.MySql;

public class BdD {
	
	MySql bdd= null;
	
	/**
	 * crée un objet MySql avec en paramètres l'identifiant, le mot de passe et l'adresse de connexion
	 */
	public BdD() {
		bdd=new MySql("root", "nicolas", "jdbc:mysql://localhost/test");
		
	}
		
	/**
	 * récupérer des informations de la base de données
	 */
	public void lire(String requete){		
		if (bdd.connecter() !=null){
			ResultSet resultat = bdd.query(requete);		
			try {
				while (resultat.next()){
					System.out.println("article: "+resultat.getString(2)+ "quantité: "+resultat.getInt(4));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		bdd.deconnecter();		
	}
	
	/**
	 * modifier(+ créer et supprimer) des informations dans la base de données
	 * @param requete : requête envoyée à la base de donnée
	 */
	public void modifier(String requete){		
		if (bdd.connecter() !=null){
			bdd.update(requete);			
		}
		bdd.deconnecter();		
	}


}
