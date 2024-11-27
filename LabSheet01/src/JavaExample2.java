import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name");
		String strproductUnit = JOptionPane.showInputDialog("input Product Unit:");
		
		int productUnit = Integer.parseInt(strproductUnit);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per Unit:"));
		double totalPriceofProduct = productUnit *productPrice; //TotalPrice
		//String frmtotalPriceogPoduct = String.
		double totalwithVat = totalPriceofProduct *1.07; // VAT
		
		JOptionPane.showMessageDialog(null, "Total Price is "+ totalPriceofProduct + " baht." + 
											"\nAdd VAT 7% is " + totalwithVat + " baht.");
		
	}

}
