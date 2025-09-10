
public class Customer {

	//Fields
	private String name;
	private double balance;
	
	
	//Constructor
	public Customer(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void deductBalance(double amount) throws InsufficientBalanceException {
		
		if (balance < amount) throw new InsufficientBalanceException("Error: Insufficient balance to complete the purchase.");
		 balance-=amount;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
}
