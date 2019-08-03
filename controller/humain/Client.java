package controller.humain;

public class Client extends Personne {
	
	/**
	 * identifiant du conseiller au sein de la banque
	 */
	private int idConseiller;
	
	/**
	 * distinction entre entreprise et particulier; true = particulier, false = entreprise
	 */
	private boolean typeClient;
	
	/**
	 * si le client poss�de un compte courant = true, sinon false
	 */
	private boolean compteCourant;
	
	/**
	 * si le client poss�de un compte �pargne = true, sinon false
	 */
	private boolean compteEpargne;
	
	/**
	 * True = client fortun�, false = client non fortun�
	 */
	private boolean clientFortune;
	
	/**
	 * plafond de d�couvert du compte courant du client
	 */
	private int decouvert;
	
	/**
	 * taux de r�muneration du compte �pargne du client
	 */
	private double remuneration;
	
	
	public Client() {
		
	}
	
	/**
	 * le conseiller cr�e un client dans la base de donn�es; renvoie vers la m�thode creerClientBDD() dans la classe BdDClient
	 * @param id : identifiant du client
	 */
	public void creerClient() {
		
	}
	
	/**
	 * le conseiller modifie les infos du client de la base de donn�es; renvoie vers la m�thode modifierInfoClientBDD() dans la classe BdDClient
	 * @param id : identifiant du client
	 */
	public void modifierInfoClient() {
		
	}	
	
	/**
	 * le conseiller supprime un client de la base de donn�es; renvoie vers la m�thode supprimerClientBDD() dans la classe BdDClient
	 * @param id : identifiant du client
	 */
	public void supprimerClient() {
		
	}
	
	/**
	 * n�gocier le plafond de d�couvert du compte courant
	 */
	public void remiseDecouvert() {
		
	}
	
	/**
	 * n�gocier le taux de r�mun�ration du compte �pargne
	 */
	public void remiseRemuneration() {
		
	}

	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public boolean isTypeClient() {
		return typeClient;
	}

	public void setTypeClient(boolean typeClient) {
		this.typeClient = typeClient;
	}

	public boolean isCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(boolean compteCourant) {
		this.compteCourant = compteCourant;
	}

	public boolean isCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(boolean compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public boolean isClientFortune() {
		return clientFortune;
	}

	public void setClientFortune(boolean clientFortune) {
		this.clientFortune = clientFortune;
	}

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	public double getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}
}
