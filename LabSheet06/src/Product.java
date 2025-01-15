
public class Product {
	
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String prdName, double prdPrice, double Rate) {
		name = prdName;
		price = prdPrice;
		vatRate = Rate;
	}
	
	public double calculateTotalPrice() {
		return (price * (vatRate/100)) + price;
	}
	
	public void displayProductDetails() {
		System.out.println("Product Details: ");
		System.out.println("Product name: " + name);
		System.out.println("Price (Before VAT): " + price);
		System.out.println("Price (After VAT): " + calculateTotalPrice());
		
	}
}
