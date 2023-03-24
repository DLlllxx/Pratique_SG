public class BanqueMain {
    public static void main(String args[]) {
	Compte cpt = new Compte(2568763);
	cpt.deposer(500.0);
	cpt.tirer(200.0);
	cpt.historique();
}
}