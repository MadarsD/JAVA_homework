package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public abstract class Card {
    private int cardNumber;
    private String owner;
    private String ccvCode;
    BigDecimal balance;

    public Card(int cardNumber, String owner, String ccvCode, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCcvCode() {
        return ccvCode;
    }

    public void setCcvCode(String ccvCode) {
        this.ccvCode = ccvCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void addMoney(BigDecimal amount){
        balance = balance.add(amount);
    };

    public  void withdrawMoney(BigDecimal amount) throws NotEnoughFundsException {
        if(amount.compareTo(balance) > 0){
            throw new NotEnoughFundsException("You dont have enough money!");
        } else {
            balance = balance.subtract(amount);
        }
    };
}
