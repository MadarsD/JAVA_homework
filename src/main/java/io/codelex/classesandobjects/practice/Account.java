package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

    public static void main(String[] args) {
        //Your first account
        Account firstAccount = new Account("First account", 100);
        firstAccount.deposit(20);
        System.out.println(firstAccount.toString());

        System.out.println();
        //Your first money transfer
        Account matts = new Account("Matt's account", 1000);
        Account myAccount = new Account("My Account", 0);
        matts.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(matts.toString());
        System.out.println(myAccount.toString());

        System.out.println();
        //Money transfers
        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        transfer(a, b, 50);
        transfer(b, c, 25);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
