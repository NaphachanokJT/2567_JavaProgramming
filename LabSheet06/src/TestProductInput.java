import java.util.*;

public class TestProductInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Product prd1 = new Product();
		
		System.out.print("Enter product name: ");
		String prdName = scan.nextLine();
		
		System.out.print("Enter product price: ");
		double prdPrice = scan.nextDouble();
		
		System.out.print
		("Enter VAT rate (%): ");
		double prdVAT = scan.nextDouble();
		
		prd1.setProductDetails(prdName, prdPrice, prdVAT);
		prd1.displayProductDetails();
		
		scan.close();
	}

}
