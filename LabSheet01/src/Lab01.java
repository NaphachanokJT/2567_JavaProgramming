import java.util.*;
import java.text.*;
public class Lab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("##,###.00");
		
		System.out.print("Input Product Name	: ");
		String productName = input.nextLine();
		
		System.out.print("Input Product Unit  	: ");
		int productUnit = input.nextInt();
		
		System.out.print("Input Prce per unit 	: ");
		float productPrice = input.nextFloat();
		
		System.out.println("--------------------------------------------------");
		
		float totalPrice = productUnit * productPrice;
		System.out.println("Total Price is " + frm.format(totalPrice) + " baht.");
		
		System.out.println("--------------------------------------------------");
		
		System.out.print("How many discount(%) 	: ");
		int priceDiscount = input.nextInt();
		
		System.out.println("--------------------------------------------------");
		
		double totalDiscount = totalPrice * 15/100;
		System.out.println("Discount from 15%		  " + frm.format(totalDiscount) + " baht.");
		double amountAll = totalPrice - totalDiscount;
		System.out.println("Amount to be paid		 " + frm.format(amountAll) + " baht.");

	}

}
