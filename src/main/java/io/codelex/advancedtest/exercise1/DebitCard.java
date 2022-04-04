package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(int cardNumber, String owner, String ccvCode, BigDecimal balance) {
        super(cardNumber, owner, ccvCode, balance);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        super.addMoney(amount);
        if (balance.compareTo(new BigDecimal("10000")) > 0) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void withdrawMoney(BigDecimal amount) throws NotEnoughFundsException {
        super.withdrawMoney(amount);
    }
}
