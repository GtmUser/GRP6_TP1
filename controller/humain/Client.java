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
	 * si le client possède un compte courant = true, sinon false
	 */
	private boolean compteCourant;
	
	/**
	 * si le client possède un compte épargne = true, sinon false
	 */
	private boolean compteEpargne;
	
	/**
	 * True = client fortuné, false = client non fortuné
	 */
	private boolean clientFortune;
	
	/**
	 * plafond de découvert du compte courant du client
	 */
	private int decouvert;
	
	/**
	 * taux de rémuneration du compte épargne du client
	 */
	private double remuneration;
	
	
	public Client() {
		
	}
	
	/**
	 * le conseiller crée un client dans la base de données; renvoie vers la méthode creerClientBDD() dans la classe BdDClient
	 * @param id : identifiant du client
	 */
	public void creerClient() {
		
	}
	
	/**
	 * le conseiller modifie les infos du client de la base de données; renvoie vers la méthode modifierInfoClientBDD() dans la classe BdDClient
	 * @param id : identifiant du client
	 */
	public void modifierInfoClient() {
		
	}	
	
	/**
	 * le conseiller supprime un client de la base de données; renvoie vers la méthode supprimerClientBDD() dans la classe BdDClient
	 * @param id : identifiant du client
	 */
	public void supprimerClient() {
		
	}
	
	/**
	 * négocier le plafond de découvert du compte courant
	 */
	public void remiseDecouvert() {
		
	}
	
	/**
	 * négocier le taux de rémunération du compte épargne
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
