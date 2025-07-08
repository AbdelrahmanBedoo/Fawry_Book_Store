public class User {
    private final String name;
    private final String email;
    private final String address;
    private double budget;

    public User(String name, String email, String address, double budget) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public double getBudget() {
        return budget;
    }

    public void deductBudget(double amount) throws InsufficientFunds {
        if (amount > budget) {
            throw new InsufficientFunds(
                    "User '" + name + "' has insufficient funds. Required: $" + amount + ", Available: $" + budget);
        }
        budget -= amount;
    }
}