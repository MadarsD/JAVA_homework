package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card{

    private BigDecimal balance;

    public DebitCard(int cardNumber, String owner, String ccvCode) {
        super(cardNumber, owner, ccvCode);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        balance = balance.add(amount);
        if(balance.compareTo(new BigDecimal("1000")) > 0){
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void withdrawMoney(BigDecimal amount) throws NotEnoughFundsException {
        if(amount.compareTo(balance) > 0){
            throw new NotEnoughFundsException("You dont have enough money!");
        } else {
            balance = balance.subtract(amount);
        }
    }
}
