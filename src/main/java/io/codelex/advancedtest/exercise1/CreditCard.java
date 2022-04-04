package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(int cardNumber, String owner, String ccvCode, BigDecimal balance) {
        super(cardNumber, owner, ccvCode, balance);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        super.addMoney(amount);
    }

    @Override
    public void withdrawMoney(BigDecimal amount) throws NotEnoughFundsException {
        super.withdrawMoney(amount);
        if (balance.compareTo(new BigDecimal("100")) < 0) {
            System.out.println("Warning: Low funds");
        }
    }
}
