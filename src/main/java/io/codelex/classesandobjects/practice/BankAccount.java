package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        if(balance < 0){
            return name + ", -$" + String.format("%.2f",-balance);
        } else {
            return name + ", $" + String.format("%.2f",balance);
        }

    }

    public static void main(String[] args) {
        BankAccount benson = new BankAccount("Benson", 17.5);
        System.out.println(benson.toString());

        benson.withdraw(33.3);
        System.out.println(benson.toString());

    }
}
