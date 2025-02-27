import java.util.*;
import java.text.*;
public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// กำหนด object ในการรับข้อมูลทาง keyboard
		Scanner input = new Scanner(System.in);
		// กำหนด object ในการรับรูปแบบตัวเลข
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//แสดงผลและรับข้อมูลชื่อสินค้า
		System.out.print("input product name: ");
		String productName = input.nextLine();
		//แสดงและรับข้อมูลสินค้า
		System.out.print("input product unit: ");
		int productUnit = input.nextInt();
		//แสดงและรับข้อมูลราคาสินค้า
		System.out.print("input price per unit: ");
		float productPrice = input.nextFloat();
		
		System.out.println(); //การเว้น 1 บรรทัด
		
		Float totalPriceofProduct = productUnit *productPrice;
		System.out.println("Total Price is "+ frm.format(totalPriceofProduct) + "Baht.");
		//คำนวณภาษีเพิ่ม 7%
		Float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		System.out.println("Add VAT 7% is " + frm.format(totalwithVat) + " Baht.");
		
		System.out.println(); // การเว้น 1 บรรทัด
		//Output using String.format and printf
		String frmtotalwithVat = String.format("%, .2f",totalwithVat);
		System.out.println("Output using String.format");
		System.out.println("Add VAT 7% is " + frmtotalwithVat + " Baht.");
		
		System.out.println();
		
		System.out.println("Output using printf");
		System.out.printf("Add VAT 7%% in %,.2f", totalwithVat);
		
		
		input.close();
	}

}
