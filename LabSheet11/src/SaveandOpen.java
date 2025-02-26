import java.io.IOException;
import java.util.*;
import java.io.*;

public class SaveandOpen extends Employee{
	
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintStream writeFile = new PrintStream(new File("src//txtFile//employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter department: ");
			dept = input.next();
			writeFile.println(name + "\t" + dept);
			System.out.print("Do you want to input data again? : ");
			answer = input.next();
		} while (answer.equalsIgnoreCase("y"));
	} //end insert
	
	public void searchData() throws IOException {
		try {
			Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next(); // ตัวแปร dept ในไฟล์ employee
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+(")" + name));
					check = true;
				}
				if (check) {
					super.header();
					System.out.print("Employee in dept " + super.getDept() + " is " + i + " person(s).");
					System.out.println();
				}
				else {
					System.out.println("\nSorry, no dept: " + super.getDept() + " in file");
				}
			}
		} catch (IOException e) {
			System.out.println("\nSorry, file not found. . .");
		}
		
	}
}
