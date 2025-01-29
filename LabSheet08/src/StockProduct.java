import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 4;
		Product[] productList= new Product[number];
		
		System.out.print("Input product Id		: ");
		productList[number].setId(sc.nextLine());
		
		System.out.print("Input product Unit	: ");
		int unit = sc.nextInt();
		while (unit <= 0) {
			System.out.print("Input product Unit, again	: ");
			unit = sc.nextInt();
		}
		productList[number].setUnit(sc.nextInt());
		
		System.out.print("Input product Price	: ");
		int price = sc.nextInt();
		while (price <= 0) {
			System.out.print("Input product Price, again	: ");
			price = sc.nextInt();
		}
		productList[number].setPrice(sc.nextDouble());
		
		System.out.print("------------------------------------------------------------");
		
		System.out.print("------------------------------------------------------------");
		//System.out.print("Total price of all products is " +  +" baht.");
	}

}
