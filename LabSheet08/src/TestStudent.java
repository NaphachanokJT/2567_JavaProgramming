import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many students in Classroom: "); // input the number of students
		int numberofStudent = scan.nextInt();
		scan.nextLine(); //Consume newline character
		
		Student[] students = new Student[numberofStudent]; // 1. Create an array of Student objects
		
		for(int i = 0 ; i < numberofStudent ; i++) { //input information for each student
			
			// 2. Create a new Student object
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT " + (i+1));
			Line();
			
			//Input student's name
			System.out.print("Input student name: ");
			/*String stdName = scan.nextLine();
			students[i].setName(stdName);*/
			students[i].setName(scan.nextLine());
			
			System.out.print("Input student score : ");
	        int score = scan.nextInt();
	        scan.nextLine();
	        students[i].setScore(score);
	        while(!students[i].checkScore()) {
	             System.out.print("Input score, again : ");
	             students[i].setScore(scan.nextInt());        	 
	         }
		 }//end of for
			
			System.out.println("\nLIST OF PASS STUDENT(>=50):");
			Line();
			for(Student student : students) {
				if(student.isPass()) {
					System.out.println(">> " + student.getName() + " (" + student.getScore() + ")" + " get grade " + findGrade(student.getScore()));
				} // end if
		} // end for
		
		scan.close();
		
	} // end of main() Method
	
	public static String findGrade(int score) {
		if(score >= 80) {
			return "A";
		} else if (score >= 76) {
			return "B+";
		} else if (score >= 70) {
			return "B";
		} else if (score >= 66) {
			return "C+";
		} else if (score >= 60) {
			return "C";
		} else if (score >= 56) {
			return "D+";
		} else if (score >= 50) {
			return "D";
		} else {
			return "F";
		}
	}
	
	public static void Line() {
		for(int i = 1 ; i <= 60 ; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
} //end of class
