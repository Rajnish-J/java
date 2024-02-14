// Practice - constructor overloading
// Task:

// Create a class called BankAccount with two constructors and two methods
// First constructor with one String parameter: holdername
// Second constructor with one parameter: balance
// Create 2 methods for displaying holdername and balance respectively
// Display the holdername of the 1st BankAccount object with holdername "John".
// Display the balance of the 2nd BankAccount with balance:- 1000.

class BankAccount {
    double balance;
    String holdername;
    
    public BankAccount(String n) {
        holdername = n;
    }
    
    public BankAccount(double b) {
        balance = b;
    }
    
    void displayName() {
        System.out.println("Account holder name: " + holdername);       
    }
    
    void displayBalance() {

        System.out.println("Balance: $" + balance);
    }
}

class Bank {
    public static void main(String[] args) {   
        BankAccount b1 = new BankAccount("John");
        BankAccount b2 = new BankAccount(1000);
        b1.displayName();
        b2.displayBalance();
    }
}