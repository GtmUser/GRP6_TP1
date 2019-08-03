import org.apache.log4j.Logger;


public class Main {
	
	private static Logger logger = Logger.getLogger(Main.class);

	public static void messageConnexion() {
		logger.info("Bienvenue sur ProxiBanqueSI. Ce logiciel est en cours de développement, merci de récupérer la mise à jour dans quelques semaines.");
	}
	
	public static void main(String[] args) {
		
		Main.messageConnexion();

	}

}
