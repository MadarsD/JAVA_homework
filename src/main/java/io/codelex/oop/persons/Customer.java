package io.codelex.oop.persons;

public class Customer extends Person {
    private final String customerId;
    private int purchaseCount = 0;

    public Customer(String firstName, String lastName, String id, int age, String customerId) {
        super(firstName, lastName, id, age);
        this.customerId = customerId;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + customerId + " " +
                 "(" + getPurchaseCount() + " purchases)";
    }
}
