package controller;

import java.sql.ResultSet;

public abstract class Compte {
	
	/**
	 * num�ro du compte
	 */
	private int idCompte;
	
	/**
	 * identifiant du conseiller au sein de la banque
	 */
	private int idConseiller;
	
	/**
	 * identifiant du virement effectu� par le conseiller
	 */
	private int idVirement;	

	/**
	 * identifiant de l'audit effectu� par le g�rant
	 */
	private int idAudit;	
	
	/**
	 * true = compte courant, false = compte �pargne
	 */
	private boolean typeCompte;
	
	/**
	 * true = visa electron, false = visa premier
	 */
	private boolean typeCarte;
	
	/**
	 * montant ajout� ou soustrait au compte
	 */
	private double operation;
	
	/**
	 * date d'ouverture du compte
	 */
	private String dateOuverture;
	
	
	public Compte() {
		
	}
	
	/**
	 * consulter les comptes pour pour calculer le taux du cr�dit
	 * @return solde du compte
	 */
	public void analyserCredit() {
		
	}
	
	/**
	 * consulter le solde du compte pour voir si le virement est possible
	 * @return true = le virement est possible, false = le virement n'est pas possible
	 */
	public boolean consulterCompte() {
		boolean a = true;
		return a;
	}
	
	/**
	 * consulter le solde du compte pour voir s'il est au-dessous du plafond
	 * @return true = le solde est au-dessus du plafond, false = le solde est au-dessous du plafond
	 */
	public boolean analyserAudit() {
		boolean a = true;
		return a;
	}
	
	/**
	 * consulter le compte pour voir si le client peut �tre class� dans les clients riches
	 * @return true = le client est classifi� comme riche, false = le client n'est pas classifi� riche
	 */
	public boolean verifierPatrimoine() {
		boolean a = true;
		return a;
	}
	
	/**
	 * v�rifier que le client ne poss�de pas d�j� une carte
	 * @return true = possibilit� de cr�er une carte, false = une carte existe d�j� et cr�ation refus�e
	 */
	public boolean verifierAssociationCarte() {
		boolean a = true;
		return a;
	}
	
	/**
	 * lire les informations du compte; renvoie vers la m�thode lireCompteBDD() dans la classe BdDCompte
	 */
	public void lireCompte() {
		
	}
	
	/**
	 * cr�er un compte; renvoie vers la m�thode creerCompteBDD() dans la classe BdDCompte
	 */
	public void creerCompte() {
		
	}
	
	/**
	 * mise � jour du solde du compte; renvoie vers la m�thode modifierSoldeCompteBDD() dans la classe BdDCompte
	 */
	public void modifierSoldeCompte() {
		
	}
	
	/**
	 * supprimer un compte; renvoie vers la m�thode supprimerCompteBDD() dans la classe BdDCompte
	 */
	public void supprimerCompte() {
		
	}
	
	/**
	 * faire une demande de cr�ation de carte
	 */
	public void souscrireCarte() {
		
	}
	
	/**
	 * dire si la carte peut �tre cr�ee ou pas
	 * @param validation : true = le compte n'a pas encore de carte et la carte peut �tre cr��e,
	 *  false = le compte a d�j� une carte associ�e et la carte ne peut pas �tre cr��e
	 * @return true = la carte est cr��e, false = la carte n'est pas cr��e
	 */ 
	public boolean creationCarte(boolean validation) {
		boolean a = true;
		return a;
	}
	
	/**
	 * Methode de lancement des m�thodes de la classe Virement 
	 */
	public void effectuerVirement() {
		
	}
	
	/**
	 * Methode de lancement des m�thodes de la classe Investissement
	 */
	public void effectuerInvestissment() {
		
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public int getIdVirement() {
		return idVirement;
	}

	public void setIdVirement(int idVirement) {
		this.idVirement = idVirement;
	}

	public int getIdAudit() {
		return idAudit;
	}

	public void setIdAudit(int idAudit) {
		this.idAudit = idAudit;
	}

	public boolean isTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(boolean typeCompte) {
		this.typeCompte = typeCompte;
	}

	public boolean isTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(boolean typeCarte) {
		this.typeCarte = typeCarte;
	}

	public double getOperation() {
		return operation;
	}

	public void setOperation(double operation) {
		this.operation = operation;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

}
