
public class PersonalInfo {

	private Person name;
    private Date birthDay;
    private int personID;
    
    public PersonalInfo() {
		this.name = new Person();
		this.birthDay = new Date();
		this.personID = 0;
	}
    
    public PersonalInfo(String first, String last, int month, int day, int year, int ID) {
        this.name = new Person(first, last);
        this.birthDay = new Date(month, day, year);
        this.personID = ID;
    }
    
    public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
        this.name.setName(first, last);
        this.birthDay.setDate(month, day, year);
        this.personID = ID;
    }
    
    public String toString() {
        return "Name: " + name + "\nDate of birth: " + birthDay + "\nPersonal ID: " + personID;
    }
}
