import java.util.Date;

public class Transaction {
	 private String operation;
     private Date date;
     private double montant;
     private double total;
     
     public Transaction(String operation, Date date, double montant, double total) {
         this.operation = operation;
         this.date = date;
         this.montant = montant;
         this.total = total;
     }
     
     public String toString() {
         return operation + " " + date + montant + "€‎ total: " + total +"€‎";
     }
 
}
