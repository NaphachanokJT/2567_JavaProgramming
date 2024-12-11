import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		//กำหนดตัวแปรชื่อ text ไว้รวมข้อความเข้าด้วยกัน
		String txtConcate = "";
		//กำหนดตำแหน่งชื่อ word ไว้สำหรับข้อความทาง Console
		String word;
		
		while(true) {
			System.out.print("Enter word: ");
			word = kb.next();
			if(word.equalsIgnoreCase("stop")) {
				System.out.println("Program Terminate");
				break;
			}
			//รวมข้อความที่ป้อนเข้าด้วยกัน
			txtConcate += word + " ";
		}
		
		System.out.println(txtConcate.toUpperCase());
		
		kb.close();

	}

}
