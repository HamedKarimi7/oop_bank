package se.lexicon;

public class BankAccount {
    /**
     * Create a class called BankAccount
     * •Create fields for account number, balance, customer name, email and
     * phone number.
     * •Create a constructor that assign values to all fields
     * •Make getters and setters for all fields
     * •Create methods to deposit and withdraw funds.
     * •Do not allow a withdrawal to complete if the balance is insufficient.
     * •Extra: Have a static counter that increment and assign the account
     * number.
     */

   private int accountNumber;
   private double balance;
   private Customer customer;

    public BankAccount(int accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
    }

    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("AMOUNT WAS NEGATIVE");
        }

        balance = balance + amount;


    }

    public double withdraw(double amount){
        if(amount < 0 ){
            throw new IllegalArgumentException("AMOUNT WAS NEGATIVE");
    }
        if(amount > balance){
        throw new IllegalArgumentException("amount is greater than balance");

        }

       balance = balance - amount;
        return balance;
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBanalce() {
        return balance;
    }


}
