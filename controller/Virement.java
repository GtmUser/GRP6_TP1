package controller;

public class Virement {
	
	public Virement() {
		
	}
	
	/**
	 * récupérer l'id du client du compte débiteur ou bénéficiaire à partir de ses informations personnelles
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
	 * récupérer l'id du compte débiteur ou bénéficiaire à partir de l'id du client
	 * @param id : identifiant du client
	 * @return identifiant du compte 
	 */
	public int recupererIdCompte(int id) {
		int a=0;
		return a;
	}
	
	/**
	 * récupérer le solde du compte débiteur ou bénéficiaire à partir de l'id du compte
	 * @param id : identifiant du compte 
	 * @return solde du compte 
	 */
	public int recupererSoldeCompte(int id) {
		int a=0;
		return a;
		
	}
	
	/**
	 * vérifier que le solde ne dépasse pas le plafond autorisé après virement
	 * @param solde du compte du client débiteur
	 * @return
	 */
	public boolean validerVirement(int solde) {
		boolean a = true;
		return a;
	}
	
	/**
	 * effectuer le virement et mettre à jour les soldes des deux comptes
	 * @param accord : true = le transfert peut être effectué, false = le transfert ne peut pas être effectué
	 */
	public void transfert(boolean accord) {
		
	}
	
	public void abandonnerOperation() {
		System.exit(0);
	}
}
