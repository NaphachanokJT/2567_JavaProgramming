
public class Theater {

	private int theaterNo;
	
	public Theater(String id, String name, Director director, int theaterNo) {
		this.theaterNo = theaterNo;
	}
	
	public Theater() {
		this.theaterNo = 0;
	}
	
	public String getTheaterName() {
		if (theaterNo >= 1 && theaterNo <= 11) {
			return "Basic Theater";
		}
		if (theaterNo >= 12 && theaterNo <= 14) {
			return "Sweet Theater";
		}
		if (theaterNo == 15) {
			return "Premium Theater";
		}
			return null;
	}
	
	public String toString() {
		return getTheaterName() + ": " + super.toString();
	}
}