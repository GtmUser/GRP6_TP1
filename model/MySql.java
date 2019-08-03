package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {
	
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String driver = "com.mysql.jdbc.Driver";
	private String adresse = null;
	private String id = null;
	private String pwd = null;
	
	/**
	 * 
	 * @param adresse : adresse de connexion
	 * @param id : identifiant pour se connecter
	 * @param pwd : mot de passe pour se connecter
	 */
	public MySql(String adresse, String id, String pwd) {		
		this.adresse = adresse;
		this.id = id;
		this.pwd = pwd;
	}
	
	/**
	 * se connecte à la base de données
	 * @return état de la connection
	 */
	public Connection connecter() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(this.adresse, this.id, this.pwd);
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println("Mauvaise adresse du driver.");
			this.con = null;
		} catch (SQLException e) {
			System.out.println("Erreur de saisie.");
			this.con = null;
		}
		return this.con;
	}
	
	/**
	 * se déconnecte
	 */
	public void deconnecter() {
		if (con != null) {
		 try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Erreur SQL.");
			}
		}	
	}
		
	/**
	 * Crée une requête de type executeUpdate
	 * @param query : champ de la requête
	 */
	public void update(String query) {
		try {
			this.stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * crée une requête de type executeQuery
	 * @param query : champ de la requête
	 * @return données
	 */
	public ResultSet query(String query) {
		try {
			this.rs = this.stmt.executeQuery(query);
		} catch (SQLException e) {
			System.out.println("Erreur SQL.");
		}
		return rs;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
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
}

