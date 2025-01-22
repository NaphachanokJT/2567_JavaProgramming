	
public class Rectangle {
	
	//private two attribute . วิธีที่ 1 
/*	private float length;
	private float width;

	//Default Constructor
	Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}*/
	
	//private two attribute . วิธีที่ 2
	private float length = 1.0f;
	private float width = 1.0f;
	
	//Default Constructor
	Rectangle() {}
	
	//Paramiterize Constructor
	Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	//Getter and Setter method
	public float getLength() {
		return this.length;
	}
	
	public void setLength(Float length) {
		this.length = length;
	}
	
	public void setWidth(Float width) {
		this.width = width;
	}
	
	public float getWidth() {
		return this.width;
	}
	public void getWidth(float width) {
		this.width = width;
	}
	
	//Method to calculate Area
	public double getArea() {
		return this.length * this.width;
	}
	
	//Method to calculate Perimeter
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	//Method to display
	public String showData() {
		return "Rectangle[length= " + this.length + ",width = " + this.width + "]";
	}
	
	//Method to display using toString()
	public String toString() {
		return "Rectangle[length= " + this.length + ",width = " + this.width + "]";
	}
}
