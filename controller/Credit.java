package controller;

public class Credit {
	
	/**
	 * identifiant du conseiller au sein de la banque
	 */
	private int idConseiller;
	
	/**
	 * taux d'emprunt du cr�dit
	 */
	private double taux;
	
	/**
	 * dur�e du cr�dit (en jours?)
	 */
	private int duree;
	
	/**
	 * montant du cr�dit
	 */
	private int montant;
	
	public Credit() {
		
	}
	
	/**
	 * r�cup�rer l'id du client du compte � partir de ses informations personnelles
	 * @param nom : nom du client
	 * @param prenom : prenom du client
	 * @param dateNaissance : date de naissance du client
	 * @return identifiant du client
	 */
	public int recupererIdClient(String nom, String prenom, String dateNaissance) {
		int a =0;
		return a;
	}
	
	/**
	 * r�cup�rer l'id du compte � partir de l'id du client
	 * @param id : identifiant du client
	 * @return identifiant du compte 
	 */
	public int recupererIdCompte(int id) {
		int a =0;
		return a;
	}
	
	/**
	 * r�cup�rer le solde du compte � partir de l'id du compte
	 * @param id : identifiant du compte 
	 * @return solde du compte 
	 */
	public int recupererSoldeCompte(int id) {
		int a =0;
		return a;
	}
		
	/**
	 * effectuer une simulation de cr�dit � partir du solde d'un compte
	 * return r�cup�re le taux du cr�dit
	 */
	public double simulation(int id, double montant, int duree) {
		double a = 0;
		return a;
	}

	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}
}
