import java.util.Scanner;

public class Lab503 {
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int[] numbers = new int[7];
       for (int i = 0; i < numbers.length; i++) {
       System.out.print("Input number "+ (i+1) + " : ");
       String input = sc.nextLine();
       numbers[i] = Integer.parseInt(input);
       }
       
       int count = 0;
       String OddNumbers = "";

       for (int number : numbers) {
           if (number % 2 != 0) {
               count++;
               OddNumbers += number + " ";
           }
       }
       System.out.println();
       System.out.println("There are " + count + " of odd number.");
       System.out.println("List of odd number : " + OddNumbers);
       
       sc.close();  
   }
}