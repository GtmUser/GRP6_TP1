package controller;

public class Audit {
	
	public Audit() {
		
	}
		
	/**
	 * r�cup�rer l'id du client du compte � partir de ses informations personnelles
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
	 * r�cup�rer l'id du compte � partir de l'id du client
	 * @param id : identifiant du client
	 * @return identifiant du compte 
	 */
	public int recupererIdCompte(int id) {
		int a=0;
		return a;
	}
	
	/**
	 * r�cup�rer le solde du compte � partir de l'id du compte
	 * @param id : identifiant du compte 
	 * @return solde du compte 
	 */
	public int recupererSoldeCompte(int id) {
		int a=0;
		return a;
	}
	
	/**
	 * calculer si le solde du compte est en dessous du plafond autoris�.
	 * @param solde du compte client audit�
	 * @return true = plafond d�pass�, false = plafond non d�pass� 
	 */
	public boolean analyserDecouvert(int solde) {		
		boolean a = true;
		return a;
	}
	
	/**
	 * ajouter le client � la liste des comptes d�f�citaires
	 */
	public void ajouterListeDefecitaire() {		
	}

}
