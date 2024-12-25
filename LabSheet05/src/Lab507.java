import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		
		for ( int i = 0 ; i < nums.length ; i++ ) {
			String ex = JOptionPane.showInputDialog("Input number " + (i + 1) + ":");
			nums[i] = Integer.parseInt(ex);
		}
		showEven(nums);
		showOdd(nums);
		
	} // end main() method
	
	public static void showEven(int[] nums) {
		String evenNums = "";
		for (int _nums : nums) {
			if ( _nums % 2 == 0) {
				evenNums += _nums + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n" + evenNums);
	} // end showEven() method
	
	public static void showOdd(int[] nums) {
		String oddNums = "";
		for (int _nums : nums) {
			if ( _nums % 2 != 0) {
				oddNums += _nums + " ";
			}		
		}
		JOptionPane.showMessageDialog(null, "List of odd number:\n" + oddNums);
	} // end oddEven() method
}
