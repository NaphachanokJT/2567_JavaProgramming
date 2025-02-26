
public class Employee {
	
	private String dept;
	
	public static void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public void header() {
		for(int i = 1 ;i<60 ; i++)
			System.out.print("*");
		System.out.println();
	}

}
