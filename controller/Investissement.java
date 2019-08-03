package controller;

public class Investissement {
	
	/**
	 * somme investie
	 */
	private double sommePlacee;

	
	public Investissement(){}
	
	
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
	 * calculer si le solde du compte client dépasse 500 000 euros.
	 * @param solde du compte du client débiteur
	 * @return true = client fortuné : attribut clientFortune du client passe a true, false = client non fortuné
	 */
	public boolean calculerSoldeFortune(int solde) {		
		boolean a = true;
		return a;
	}
	
	/**
	 * placer une somme
	 * @param clientFortune : true = client fortuné, l'investissement peut être effectué, false = pas d'investissement possible
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
