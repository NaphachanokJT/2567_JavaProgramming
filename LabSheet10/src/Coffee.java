
public class Coffee {
	
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	public void coffee(int type, char sizeCoffee, int typeCoffee, Barista barista) {
		this.typeCoffee = type;
		this.sizeCoffee = sizeCoffee;
		this.typeCoffee = typeCoffee;
		this.barista = barista;
	}
	
	public void coffee(int type, int Coffee) {
		this.typeCoffee = type;
		this.typeCoffee = typeCoffee;
	}
	
	Barista getBarista() {
		return barista;
	}
	
	String getTypeName() {
		if (this.typeCoffee == 1) {	
			 return "Americano";
		 }
		 else if(this.typeCoffee == 2) {
			 return "Espresso";
		 } 
		 else if(this.typeCoffee == 3 ) {
			 return "Cappuccino";
		 }
		 else return null;
	}
	
	int getTypePrice() {
		if(this.typeCoffee == 1) {
			 return 50;
		 }
		 else if(this.typeCoffee == 2) {
			 return 55;
		 }
		 else if(this.typeCoffee == 3) {
			 return 65;
		 }
		 else return 0;
	}
	
	String getSizeName() {
		if(this.sizeCoffee == 's'|| this.sizeCoffee == 'S') {
			 return "Short";
		 }
		 else if(this.sizeCoffee == 't'|| this.sizeCoffee == 'T') {
			 return "Tall";
		 }
		 else if(this.sizeCoffee == 'g'|| this.sizeCoffee == 'G') {
			 return "Grande";
		 }
		 else if(this.sizeCoffee == 'v'|| this.sizeCoffee == 'V') {
			 return "Venti";
		 }
		 else return null;
	}
	
	int getSizePrice() {
		if(this.sizeCoffee == 's'|| this.sizeCoffee == 'S') {
			 return 100;
		 }
		 else if(this.sizeCoffee == 't'|| this.sizeCoffee == 'T') {
			 return 150;
		 }
		 else if(this.sizeCoffee == 'g'|| this.sizeCoffee == 'G') {
			 return 200;
		 }
		 else if(this.sizeCoffee == 'v'|| this.sizeCoffee == 'V') {
			 return 250;
		 }
		 else return 0;
	}
	
	int getTotalPrice() {
		return getTotalPrice() + getTypePrice() + getSizePrice();
	}
	
	public String toString() {
		return  getTypeName() + " " + getTypeName() + " " + "(" + getSizeName() + ")"+ getTotalPrice() + "baht.";
	}
}
