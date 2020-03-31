
public class Account {
	private int id;
	private Customer customer;
	private double balance;
	
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance; // DOLLARS
	}
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
		this.balance = 0.0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return Math.round(balance * 100.0) / 100.0;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return customer.toString() + " " + "balance = $" + Math.round(balance * 100.0) / 100.0;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	public Account deposit(double amount) {
		balance += amount;
		return this;
	}
	public Account withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}
		else {
			System.out.println("");
		}
		return this;
	}
}
