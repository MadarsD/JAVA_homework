package io.codelex.advancedtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private static final int capacity = 10;
    private final T content;
    private final List<T> items;

    public Basket(T content) {
        this.content = content;
        this.items = new ArrayList<>();
    }

    public void addToBasket(T item) throws BasketFullException {
        if(items.size() == capacity){
            throw new BasketFullException("basket is already full!");
        } else {
            items.add(item);
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if(items.isEmpty()){
            throw new BasketEmptyException("Basket is empty!");
        } else{
            items.remove(item);
        }
    }
}
