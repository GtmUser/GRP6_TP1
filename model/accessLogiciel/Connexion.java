package model.accessLogiciel;

import java.sql.Connection;

public class Connexion {
	
	/**
	 * identifiant de connexion de l'employé
	 */
	private String id;
	
	/**
	 * mot de passe de connexion de l'employé
	 */
	private String pwd;
	
	
	private Connection con;
	

	public Connexion() {

	}
	
	/**
	 * se connecter à la base de données
	 * @return état de la connection
	 */
	public Connection connecter(String id, String pwd) {
		return this.con;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

}
