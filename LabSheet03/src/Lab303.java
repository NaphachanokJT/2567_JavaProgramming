import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		int space = 0;
		int word = 0;
		System.out.print("Input a sentence: ");
		String sentence = sr.nextLine();
		
		while (!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again: ");
			sentence = sr.nextLine();
		}
		for (int i = 0 ; i < sentence.length() ; i++ ) {
			if (sentence.charAt(i)== ' ') {
				space++;
			}
		}
		String [] splitword = sentence.split(" ");
		for ( int i = 0 ; i < splitword.length ; i++) {
			word++;
		}
		
		System.out.println();
		System.out.println("This sentence has " + space + " spacebar.");
		System.out.println("This sentence has " + word + " word.");

	}

}
