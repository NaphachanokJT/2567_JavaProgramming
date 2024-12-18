import java.util.*;
import java.text.*;
public class Lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number of minutes: ");
		int number = input.nextInt();
		
		int minuteofOneyear = 60*24*365;
		int minuteofOneday = 60*24;
		int year = number / minuteofOneyear;
		int minuteMod = number % minuteofOneyear;
		int day = minuteMod / minuteofOneday;
		
		System.out.println(number +" minutes is approximately " + year + " years and " + day + " days");
		input.close();
	}

}
