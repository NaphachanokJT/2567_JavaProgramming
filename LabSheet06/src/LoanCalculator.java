
public class LoanCalculator {
	
   private String productName;
   private double price;
   private double interestRate;
   private int years;
   
   public void setLoanDetails(String name, double price, double rate, int years) {
       this.productName = name;
       this.price = price;
       this.interestRate = rate;
       this.years = years;
   }
   
   public double calculateMonthlyPayment() {
       double monthlyRate = (interestRate / 100) / 12;
       double yearToMonth = years * 12;
       double monthlyPayment = (price * monthlyRate * Math.pow(1+monthlyRate,yearToMonth)) / (Math.pow(1+monthlyRate,yearToMonth) -1);
       return monthlyPayment;
   }
   
   public void displayLoanDetails() {
       System.out.println("Product: " + productName);
       System.out.println("Price: " + price);
       System.out.println("Interest Rate: " + interestRate + "%");
       System.out.println("Loan Period: " + years + " years");
       System.out.println("Monthly Payment: " + calculateMonthlyPayment());
   }
}