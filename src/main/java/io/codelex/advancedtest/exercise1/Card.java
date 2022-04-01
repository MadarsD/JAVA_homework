package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public abstract class Card {
    private int cardNumber;
    private String owner;
    private String ccvCode;

    public Card(int cardNumber, String owner, String ccvCode) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.ccvCode = ccvCode;
    }

    public abstract void addMoney(BigDecimal amount);

    public abstract void withdrawMoney(BigDecimal amount) throws NotEnoughFundsException;
}
