# Online-Shopping-System-with-Exception-Handling
# SmartCart – Exception-Proof Online Shopping System

This is a Java console-based online shopping system called **SmartCart**.  
It allows customers to browse products, add them to a cart, and proceed to checkout.  
The system is designed to be **exception-proof** by handling input errors and business rule violations with Java exceptions.

---

## Features
- Predefined products with ID, name, and price.
- Customer with a balance that decreases when checking out.
- Cart to hold products, calculate total, and handle checkout.
- Exception handling:
  - InputMismatchException for invalid user input.
  - EmptyCartException when trying to checkout with no items.
  - InsufficientBalanceException when the customer does not have enough balance.

---

## Classes
- **Product** → Represents a product with id, name, and price.  
- **Customer** → Represents a customer with name and balance.  
- **Cart** → Holds products, calculates total price, and checks out.  
- **Custom Exceptions** →  
  - `EmptyCartException`  
  - `InsufficientBalanceException`  
- **Store (Main Class)** → Runs the program and handles all input/output.

---

## Sample Run

```text
Welcome to SmartCart!
Enter your name: Alice
Enter your balance: 50.0

Available products:
1. Headphones - $25.99
2. Charger - $15.50
3. USB Cable - $9.75

Select a product to add to cart (enter ID, -1 to stop): abc
Invalid input. Please enter a number.

Select a product to add to cart (enter ID, -1 to stop): 4
No product with ID 4.

Select a product to add to cart (enter ID, -1 to stop): 1
Added Headphones to cart.

Checkout now? (yes/no): yes
