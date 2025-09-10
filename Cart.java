import java.util.ArrayList;
import java.util.List;
public class Cart {

	//Fields
	private List <Product> items; 
	
	//Constructor 
	public Cart()
	{
		items = new ArrayList <>();
	}
	
	//Add product method
	public void addProduct (Product p) {
		items.add(p);
	}
	
	//Get total price method
	public double getTotalPrice() {
		double total=0;
		for (Product p : items)
		{
			total+=p.getPrice();
		}
		return total;
	}
	
	//Checkout
	public void checkout(Customer c) throws EmptyCartException, InsufficientBalanceException {
		System.out.println("Checking out...");
		if (items.isEmpty()) throw new EmptyCartException("Error: Your cart is empty.");
		c.deductBalance(getTotalPrice());
		System.out.println("Your purchase was successful.");
	}

}
