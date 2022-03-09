package io.codelex.classesandobjects.practice.Exercise_8;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double annualInterestRate;
        double startingBalance;
        int monthsPassed;
        double depositAmount;
        double withdrawAmount;

        System.out.println("How much money is in the account?: ");
        startingBalance = sc.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        annualInterestRate = sc.nextDouble();

        System.out.println("How long has the account been opened?: ");
        monthsPassed = sc.nextInt();

        SavingsAccount account = new SavingsAccount(startingBalance);

        for (int i = 1; i <= monthsPassed; i++){

            System.out.println("Enter amount deposited for month " + i + ": ");
            depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            System.out.println("Enter amount withdrawn for month " + i + ": ");
            withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);

            account.addMonthlyInterest(annualInterestRate);
        }

        double balance = Math.round(account.getStartingBalance() * 100.0)/100.0;
        double interestTotal = Math.round(account.getInterestEarned() * 100.0)/100.0;
        System.out.println();
        System.out.println("Total deposited: $" + account.getTotalDeposit());
        System.out.println("Total withdrawn: $" + account.getTotalWithdraw());
        System.out.println("Interest earned: $" + interestTotal);
        System.out.println("Ending balance: $" + balance);

    }
}
