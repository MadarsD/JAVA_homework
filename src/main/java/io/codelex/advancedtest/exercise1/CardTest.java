package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public class CardTest {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard creditCard = new CreditCard(1234, "Bob Bobby", "045", new BigDecimal("100"));
        DebitCard debitCard = new DebitCard(4321, "Tom Tommy", "540", new BigDecimal("1000"));

        //creditCard.withdrawMoney(new BigDecimal("200"));
        creditCard.withdrawMoney(new BigDecimal(20));
        System.out.println(creditCard.getBalance());

        debitCard.addMoney(new BigDecimal(10000));
        System.out.println(debitCard.getBalance());
    }
}
