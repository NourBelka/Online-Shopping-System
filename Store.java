import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Store {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Creating products
		Product p1 = new Product(1, "Headphones", 25.99);
		Product p2 = new Product(2, "Charger", 15.50);
		Product p3 = new Product(3, "USB Cable", 9.75);
		
		
		System.out.println("Welcome to SmartCart!");
		
		//Asking for the user's name and balance
		System.out.print("Enter your name: ");
		String name = scanner.next();
		double balance=0;
		
		while (true) {
			try { 
				System.out.print("Enter your balance: ");
				balance = scanner.nextDouble();
				break;
				
					
			} catch (InputMismatchException inputmismatchexception) {
				System.out.println("Invalid input. Please enter a number.");
				scanner.nextLine();
			}
			
		}
		
		//Creating customer 			
		Customer c1 = new Customer(name, balance);
		
		
		//Listing available products
		System.out.println("\nAvailable products: ");
		List <Product> list = new ArrayList <>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for (int i=0; i < list.size() ; i++) 
			{
			System.out.println((i+1) + ". " + list.get(i));
			}
			
			
		//Creating cart
		Cart cart1 = new Cart();
			
		
		//Selecting products by ID
		boolean found = false;
		
		while (true) {
			System.out.print("\nSelect a product to add to cart (enter ID, -1 to stop): ");
			
			try {
				
				int id = scanner.nextInt();
				if (id==-1) break;

				
				else {
					for(Product p: list) {
					    if (id==p.getId()) {
					        cart1.addProduct(p);
					        System.out.println("Added " + p.getName() + " to cart.");
					        found = true;
					        break; 
					        }
					        
					    } if (!found) {
					        System.out.println("No product with ID " + id + ".");
					    
					}
				}
									
			
			}
			 catch (InputMismatchException inputmismatchexception) {
				System.out.println("Invalid input. Please enter a number.");
				scanner.nextLine();
				System.out.println(""); }
				
			}
			

	
		System.out.print("\nCheckout now? (yes/no)");
		String answ = scanner.next();
		if (answ.equalsIgnoreCase("yes")) {
			try {
				cart1.checkout(c1);

			} catch (EmptyCartException empty) {
                System.out.println(empty.getMessage());
            } catch (InsufficientBalanceException insufficient) {
                System.out.println(insufficient.getMessage());
            }
        } 
			
		scanner.close();
	}
}
	


