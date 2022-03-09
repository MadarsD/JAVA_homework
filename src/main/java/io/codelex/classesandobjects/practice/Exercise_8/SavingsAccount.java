package io.codelex.classesandobjects.practice.Exercise_8;

public class SavingsAccount {
    private double startingBalance;
    private double annualInterestRate;
    private double totalDeposit;
    private double totalWithdraw;
    private double interestEarned;

    public SavingsAccount(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public double getStartingBalance() {
        return startingBalance;
    }

    public double getTotalDeposit() {
        return totalDeposit;
    }

    public double getTotalWithdraw() {
        return totalWithdraw;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void withdraw(double amount){
        startingBalance -= amount;
        totalWithdraw += amount;
    }

    public void deposit(double amount){
        startingBalance += amount;
        totalDeposit += amount;
    }

    public void addMonthlyInterest(double annualInterestRate){
        double monthlyInterest = (annualInterestRate/12) * startingBalance;
        startingBalance += monthlyInterest;
        interestEarned += monthlyInterest;

    }

}
