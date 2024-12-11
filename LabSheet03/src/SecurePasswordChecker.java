import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your password(type 'exit' to quit): ");
			String password = scan.nextLine();
			//Check if user wants to exit
			
			if (password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			
			//Validate password
			String error = "";
			//check for minimum length
			
			if(password.length()<0) {
				error += "- Password must be at least 8 characters long.\n";
			}
			//check for at least one digit,uppercase,lowercase
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			
			for (int i = 0 ; i<password.length() ; i++) {
				char ch = password.charAt(i);
				
				if(ch >= 'A' && ch <= 'Z') {
					hasUpperCase = true;
				}else if(ch >= 'a' && ch <= 'z') {
					hasLowerCase = true;
				}else if (ch >= '0' && ch <= '9') {
					hasDigit = true;
				}
			}
			
			if (!hasUpperCase) {
				error += "- Password must contain at lease one uppercase letter(A-Z).\n";
			}if (!hasLowerCase) {
				error += "- Password must contain at lease one uppercase letter(a-z).\\n";
			}if (!hasDigit) {
				error += "- Password must contain at lease one uppercase letter(0-9).\\n";
			}
			
			//Display errors or success message
			if(error.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
			}else {
				System.out.println("Password validation errors.");
				System.out.println(error);
			}
		}// end of while
		
		scan.close();

	}

}
