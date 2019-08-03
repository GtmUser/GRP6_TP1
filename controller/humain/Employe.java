package controller.humain;

public class Employe extends Personne{
	
	/**
	 * identifiant pour se connecter à la base de données
	 */
	private String login;
	
	/**
	 * mot de passe pour se connecter à la base de données
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
