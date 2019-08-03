package controller.humain;

public class Conseiller extends Employe {
	
	/**
	 * identifiant du conseiller au sein de la banque
	 */
	private int idConseiller;
	
	/**
	 * nombre de clients g�r�s par le conseiller
	 */
	private int nbClients;
	
	public Conseiller() {
		
	}
	
	/**
	 * affiche le montant, le taux et la dur�e du cr�dit
	 * @param montant du cr�dit
	 * @param taux du cr�dit
	 * @param dur�e du cr�dit
	 */
	public void affichageSimCredit(int somme, double taux, int dur�e) {
		
	}
	
	/**
	 * bool�en qui va afficher la validation ou non du virement; renvoie aussi vers une m�thode dans View
	 * @return true = annoncer confirmation, false = annoncer l'�chec du virement
	 */
	public boolean confirmerVirement() {
		boolean a = true;
		return a;
	}
	
	/**
	 * bool�en qui va afficher la validation ou non de la gestion du patrimoine; renvoie aussi vers une m�thode dans View
	 * @return true = annoncer confirmation, false = annoncer l'�chec de la gestion du patrimoine
	 */
	public boolean validerPatrimoine() {
		boolean a = true;
		return a;
	}
	
	/**
	 * bool�en qui va afficher la validation ou non de la cr�ation de la carte; renvoie aussi vers une m�thode dans View
	 * @return true = annoncer confirmation, false = annoncer l'�chec de la cr�ation de la carte
	 */
	public boolean validerCarte() {
		boolean a = true;
		return a;
	}
	
	/**
	 * bool�en qui va afficher la validation ou non de la cr�ation du compte; renvoie aussi vers une m�thode dans View
	 * @return true = annoncer confirmation, false = annoncer l'�chec de la cr�ation du compte
	 */
	public boolean confirmerCreaCompte() {
		boolean a = true;
		return a;
	}
	
	/**
	 * bool�en qui va afficher la validation ou non de la suppression du compte; renvoie aussi vers une m�thode dans View
	 * @return true = annoncer confirmation, false = annoncer l'�chec de la suppression du compte
	 */
	public boolean confirmerSuppCompte() {
		boolean a = true;
		return a;
	}
	
	/**
	 * bool�en qui va afficher la validation ou non de la modification du compte; renvoie aussi vers une m�thode dans View
	 * @return true = annoncer confirmation, false = annoncer l'�chec de la modification du compte
	 */
	public boolean confirmerModifCompte() {
		boolean a = true;
		return a;
	}
	
	/**
	 * bool�en qui va calculer si le nombre de clients par conseiller est atteint
	 * @return true = nombre de clients < 11, false = nombre de clients > 11
	 */
	public boolean calculLimiteClients() {
		boolean a = true;
		return a;
	}

	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public int getNbClients() {
		return nbClients;
	}

	public void setNbClients(int nbClients) {
		this.nbClients = nbClients;
	}
	
	
}
