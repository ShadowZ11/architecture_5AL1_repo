package org.example.products;

public enum PriceEnum {
    SMALL_PRICE(2),
    MEDIUM_PRICE(3),
    LARGE_PRICE(4),
    NORMAL_DESSERT_PRICE(2),
    SPECIAL_DESSERT_PRICE(4),
    COFFEE_PRICE(1),
    DISH_PRICE(15),
    SANDWICH_PRICE(10);

    private final int price;

    PriceEnum(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}
