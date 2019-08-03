package controller;

public class Virement {
	
	public Virement() {
		
	}
	
	/**
	 * r�cup�rer l'id du client du compte d�biteur ou b�n�ficiaire � partir de ses informations personnelles
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
	 * r�cup�rer l'id du compte d�biteur ou b�n�ficiaire � partir de l'id du client
	 * @param id : identifiant du client
	 * @return identifiant du compte 
	 */
	public int recupererIdCompte(int id) {
		int a=0;
		return a;
	}
	
	/**
	 * r�cup�rer le solde du compte d�biteur ou b�n�ficiaire � partir de l'id du compte
	 * @param id : identifiant du compte 
	 * @return solde du compte 
	 */
	public int recupererSoldeCompte(int id) {
		int a=0;
		return a;
		
	}
	
	/**
	 * v�rifier que le solde ne d�passe pas le plafond autoris� apr�s virement
	 * @param solde du compte du client d�biteur
	 * @return
	 */
	public boolean validerVirement(int solde) {
		boolean a = true;
		return a;
	}
	
	/**
	 * effectuer le virement et mettre � jour les soldes des deux comptes
	 * @param accord : true = le transfert peut �tre effectu�, false = le transfert ne peut pas �tre effectu�
	 */
	public void transfert(boolean accord) {
		
	}
	
	public void abandonnerOperation() {
		System.exit(0);
	}
}
