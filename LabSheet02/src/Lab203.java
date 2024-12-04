import javax.swing.*;

public class Lab203 {

	public static void main(String[] args) {
		
	    double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight : "));
	    double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Height : "));
	    
	    double meter = height / 100;
	    double	BMI = weight / (meter *meter );
	    
	    String category;
	    if (BMI < 18.5 ) {
	    	category = "Underweight";
	    }
	    else if ( BMI >= 18.5 && BMI <= 24.9) {
	    	category = "Normal-weight";
	    }
	    else if ( BMI >= 25.0 && BMI <= 29.9) {
	    	category = "Over-weight";
	    }
	    else {
	    	category = "Obesity";
	    }
	    String frmBMI = String.format("%.1f",BMI);
	    JOptionPane.showMessageDialog(null, "BML = " + frmBMI + "\nYou're " + category,"BMI",JOptionPane.WARNING_MESSAGE);
	}

}
