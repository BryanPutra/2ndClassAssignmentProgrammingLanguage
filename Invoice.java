
public class Invoice {
	private int ID;
	private Customer customer;
	private double amount;
	
	public Invoice(int ID, Customer customer, double amount) {
		this.ID = ID;
		this.customer = customer;
		this.amount = amount;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	public double getAmountAfterDiscount() {
		return amount - (amount * ((double)customer.getDiscount() / (double)100));
	}
}
