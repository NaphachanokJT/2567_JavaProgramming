import java.util.*;
 
public class Lab204 {
 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input value of X :");
		int numOfx = input.nextInt();
		System.out.print("Input value of Y :");
		int numOfy = input.nextInt();
		int sum = numOfx;
		
		while(numOfy<=numOfx)
		{
			System.out.print("Input value of Y, again :");
			numOfy = input.nextInt();
		}
		System.out.println();
		
		while(numOfy>numOfx)
		{
			numOfx++;
			System.out.println(sum+" + "+numOfx+" = " + (sum+numOfx));
			sum = sum+numOfx;
		}
		input.close();
	}
 
}
