package controller;

public class Credit {
	
	/**
	 * identifiant du conseiller au sein de la banque
	 */
	private int idConseiller;
	
	/**
	 * taux d'emprunt du crédit
	 */
	private double taux;
	
	/**
	 * durée du crédit (en jours?)
	 */
	private int duree;
	
	/**
	 * montant du crédit
	 */
	private int montant;
	
	public Credit() {
		
	}
	
	/**
	 * récupérer l'id du client du compte à partir de ses informations personnelles
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
	 * récupérer l'id du compte à partir de l'id du client
	 * @param id : identifiant du client
	 * @return identifiant du compte 
	 */
	public int recupererIdCompte(int id) {
		int a =0;
		return a;
	}
	
	/**
	 * récupérer le solde du compte à partir de l'id du compte
	 * @param id : identifiant du compte 
	 * @return solde du compte 
	 */
	public int recupererSoldeCompte(int id) {
		int a =0;
		return a;
	}
		
	/**
	 * effectuer une simulation de crédit à partir du solde d'un compte
	 * return récupère le taux du crédit
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
