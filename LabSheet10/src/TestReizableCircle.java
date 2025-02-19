
public class TestReizableCircle {

	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle(10.0);
		System.out.println(rc);
		String frmResult = String.format("%.2f", rc.getPerimeter());
		System.out.println("Perimeter: "+ rc.getPerimeter());
		System.out.println("Area: "+ rc.getArea());
		Line();
		rc.resize(50);
		System.out.println("After resize(50%): "+ rc);
		System.out.println("Perimeter: "+ frmResult);
		System.out.println("Area: "+ rc.getArea());
		
		/*ResizableCircle rc1 = new ResizableCircle(5.0);
		System.out.println("After resiza(50%): " + rc1);
		System.out.println("Perimeter: "+ rc1.getPerimeter());
		System.out.println("Area: "+ rc1.getArea());*/
	}
	
	public static void Line() {
		for(int i = 1 ; i < 50 ; i++)
			System.out.print("*");
		System.out.println();
	}

}
