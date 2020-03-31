
public class Customer {
	private int ID;
	private String name;
	private int discount;
	private char gender;
	
	public Customer(int ID, String name, int discount) {
		this.ID = ID;
		this.name = name;
		this.discount = discount;
	}
	public Customer(int ID, String name, char gender) {
		this.ID = ID;
		this.name = name;
		this.gender = gender;
	}
	
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public int getDiscount() {
		return discount;
	}
	public char getGender() {
		return gender;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return this.name + "(" + this.ID + ")";
	}
	
	
}
