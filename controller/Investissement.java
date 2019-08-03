package controller;

public class Investissement {
	
	/**
	 * somme investie
	 */
	private double sommePlacee;

	
	public Investissement(){}
	
	
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
	 * calculer si le solde du compte client d�passe 500 000 euros.
	 * @param solde du compte du client d�biteur
	 * @return true = client fortun� : attribut clientFortune du client passe a true, false = client non fortun�
	 */
	public boolean calculerSoldeFortune(int solde) {		
		boolean a = true;
		return a;
	}
	
	/**
	 * placer une somme
	 * @param clientFortune : true = client fortun�, l'investissement peut �tre effectu�, false = pas d'investissement possible
	 */
	public void investir(boolean clientFortune) {
		
	}


	public double getSommePlacee() {
		return sommePlacee;
	}


	public void setSommePlacee(double sommePlacee) {
		this.sommePlacee = sommePlacee;
	}
	
	
	
	
	
}
