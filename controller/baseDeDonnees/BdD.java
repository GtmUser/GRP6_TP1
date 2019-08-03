package controller.baseDeDonnees;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.MySql;

public class BdD {
	
	MySql bdd= null;
	
	/**
	 * cr�e un objet MySql avec en param�tres l'identifiant, le mot de passe et l'adresse de connexion
	 */
	public BdD() {
		bdd=new MySql("root", "nicolas", "jdbc:mysql://localhost/test");
		
	}
		
	/**
	 * r�cup�rer des informations de la base de donn�es
	 */
	public void lire(String requete){		
		if (bdd.connecter() !=null){
			ResultSet resultat = bdd.query(requete);		
			try {
				while (resultat.next()){
					System.out.println("article: "+resultat.getString(2)+ "quantit�: "+resultat.getInt(4));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
		bdd.deconnecter();		
	}
	
	/**
	 * modifier(+ cr�er et supprimer) des informations dans la base de donn�es
	 * @param requete : requ�te envoy�e � la base de donn�e
	 */
	public void modifier(String requete){		
		if (bdd.connecter() !=null){
			bdd.update(requete);			
		}
		bdd.deconnecter();		
	}


}
