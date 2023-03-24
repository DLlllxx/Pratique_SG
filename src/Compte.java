import java.util.ArrayList;
import java.util.Date;

public class Compte {
	 	private int compte;
	    private double total;
	    private ArrayList<Transaction> transactions;
	    public static String depose = "Déposer";
	    public static String tire = "Tirer";
	    public Compte(int compte) {
	        this.compte = compte;
	        this.total = getRandomNumber(0,10000000);
	        this.transactions = new ArrayList<Transaction>();
	    }
	    
	    public void deposer(double montant) {
	        if (montant <= 0) {
	            System.out.println("Vous ne pouvez pas déposer un montant moins 0");
	            return;
	        }
	        System.out.println("Le montant initial sur votre compte " + compte + ": " + total +"€‎");
	        total += montant;
	        transactions.add(new Transaction(depose, new Date(), montant, total));
	        
	        System.out.println("Vous avez déposé "+montant +"€‎" +" sur votre compte "+compte+ " Maintenant le montant total est "+total+"€‎");
	    }
	    
	    public void tirer(double montant) {
	        if (montant <= 0) {
	            System.out.println("Vous ne pouvez pas tirer un montant moins 0");
	            return;
	        }
	        
	        if (total < montant) {
	            System.out.println("Insuffisant");
	            return;
	        }
	        System.out.println("Le montant initial sur votre compte " + compte + ": " + total+"€‎");
	        total -= montant;
	        transactions.add(new Transaction(tire, new Date(), montant, total));
	        
	        System.out.println("Vous avez tiré "+montant+"€‎" +" sur votre compte "+compte+ " Maintenant le montant total est "+total+"€‎");
	    }
	    
	    public void historique() {
	    	System.out.println("************");
	        System.out.println("Historique du compte " + compte + ":");
	        
	        for (Transaction t : transactions) {
	            System.out.println(t);
	        }
	        
	        System.out.println("Montant total sur le compte "+compte +": " + total+"€‎");
	    }
	    public int getRandomNumber(int min, int max) {
	        return (int) ((Math.random() * (max - min)) + min);
	    }
}
