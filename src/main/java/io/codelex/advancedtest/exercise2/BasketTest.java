package io.codelex.advancedtest.exercise2;

public class BasketTest {
    public static void main(String[] args) throws BasketFullException, BasketEmptyException {
        Apple apple = new Apple();
        Mushroom mushroom = new Mushroom();

        Basket<Apple> appleBasket = new Basket<>();
        Basket<Mushroom> mushroomBasket = new Basket<>();

        mushroomBasket.removeFromBasket(mushroom);

        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
    }
}
