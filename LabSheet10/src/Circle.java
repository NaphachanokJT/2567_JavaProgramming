
public class Circle implements GeometricObject{
	
	protected double radius;
	Circle(double raidus) {
		this.radius = raidus;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	} //method 1 done
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	} //method 2 done
	
	public String toString() {
		return "Circle[radius=" + this.radius + "]";
	}

}
