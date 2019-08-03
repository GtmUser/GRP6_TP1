package controller;

public class Audit {
	
	public Audit() {
		
	}
		
	/**
	 * récupérer l'id du client du compte à partir de ses informations personnelles
	 * @param nom : nom du client
	 * @param prenom : prenom du client
	 * @param dateNaissance : date de naissance du client
	 * @return identifiant du client
	 */
	public int recupererIdClient(String nom, String prenom, String dateNaissance) {
		int a=0;
		return a;
	}
	
	/**
	 * récupérer l'id du compte à partir de l'id du client
	 * @param id : identifiant du client
	 * @return identifiant du compte 
	 */
	public int recupererIdCompte(int id) {
		int a=0;
		return a;
	}
	
	/**
	 * récupérer le solde du compte à partir de l'id du compte
	 * @param id : identifiant du compte 
	 * @return solde du compte 
	 */
	public int recupererSoldeCompte(int id) {
		int a=0;
		return a;
	}
	
	/**
	 * calculer si le solde du compte est en dessous du plafond autorisé.
	 * @param solde du compte client audité
	 * @return true = plafond dépassé, false = plafond non dépassé 
	 */
	public boolean analyserDecouvert(int solde) {		
		boolean a = true;
		return a;
	}
	
	/**
	 * ajouter le client à la liste des comptes défécitaires
	 */
	public void ajouterListeDefecitaire() {		
	}

}
