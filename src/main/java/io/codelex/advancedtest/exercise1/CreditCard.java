package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card{

    private BigDecimal balance;

    public CreditCard(int cardNumber, String owner, String ccvCode) {
        super(cardNumber, owner, ccvCode);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void withdrawMoney(BigDecimal amount) throws NotEnoughFundsException {
        if(amount.compareTo(balance) > 0){
            throw new NotEnoughFundsException("You dont have enough money!");
        } else {
            balance = balance.subtract(amount);
        }
        if(balance.compareTo(new BigDecimal("100")) < 0){
            System.out.println("Warning: Low funds");
        }
    }


}
