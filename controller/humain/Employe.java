package controller.humain;

public class Employe extends Personne{
	
	/**
	 * identifiant pour se connecter � la base de donn�es
	 */
	private String login;
	
	/**
	 * mot de passe pour se connecter � la base de donn�es
	 */
	private String password;
	
	
	public Employe() {
		
	}
	
	public void negocier() {
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
