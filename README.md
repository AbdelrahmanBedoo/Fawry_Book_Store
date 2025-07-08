# Fawary Bookstore


## Features
- **Book Types:**
  - **PaperBook:** Has stock, can be shipped to an address.
  - **EBook:** Has a file type, can be sent via email.
  - **DemoBook:** Showcase book, not for sale, never removed as outdated.
- **Inventory Management:**
  - Add books with ISBN, title, author, year, price, and type.
  - Remove and return outdated books (except demo books).
- **Purchasing:**
  - Buy books by ISBN and quantity.
  - Reduces stock, checks user budget, throws errors if not available or insufficient funds.
  - Returns paid amount and updates user budget.
  - PaperBooks are "shipped" (simulated), EBooks are "emailed" (simulated).
- **User System:**
  - Users have a name, email, address, and budget.
  - Budget is checked before purchase.
- **Extensible Design:**
  - Easily add new book types or delivery methods using OOP and design patterns.
- **Testing:**
  - Includes a test class demonstrating adding, removing, and buying books.

## How to Run

1. **Compile all Java files:**
   ```sh
   javac src/*.java
   ```
2. **Run the main application:**
   ```sh
   java -cp src App
   ```
   This will execute the test scenario and print results to the console.

## Project Structure

- `App.java` - Entry point, runs the test class.
- `Testing.java` - Demonstrates adding, removing, and buying books.
- `QuantumBookstore.java` - Facade for store operations.
- `Inventory.java` - Manages book inventory.
- `BookSystem.java` - Factory for creating books.
- `User.java` - Represents a user with budget, email, and address.
- `PaperBook.java`, `EBook.java`, `DemoBook.java` - Book types.
- `DeliveryByEmail.java`, `ShippingDelivery.java`, `NoDelivery.java` - Delivery strategies.
- `OutOfStock.java`, `InsufficientFunds.java` - Custom exceptions.

## Extending the System

- **Add a new book type:**
  - Create a new class implementing `Book` and extend `AbstractBook`.
  - Add a creation method in `BookSystem`.
- **Add a new delivery method:**
  - Implement the `Delievery` interface.
  - Use it in a book type as needed.
- **Add user features:**
  - Extend the `User` class with more fields or methods as required.

## License
This project is for Fawary Full Stack Internship Program 2025.
