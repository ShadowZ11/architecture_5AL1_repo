package org.example;

import org.example.products.SizeEnum;

import static org.example.products.PriceEnum.*;
import static org.example.products.SizeEnum.*;

public class App {

    public int Compute(String mealType, String mealName, String beverage, String beverageSize, String dessertType, String dessertSize, String coffee) {
        if (isInvalid(mealType, mealName, beverage)) {
            return -1;
        }

        int total = calculateMealPrice(mealType);
        total += calculateBeveragePrice(beverageSize);
        total += calculateDessertPrice(dessertType);
        total += calculateCoffeePrice(coffee, mealType, dessertSize, beverageSize);

        return total;
    }

    private boolean isInvalid(String mealType, String mealName, String beverage) {
        return mealType == null || mealName == null || beverage == null || mealType.isBlank() || mealName.isBlank() || beverage.isBlank();
    }

    private int calculateMealPrice(String mealType) {
        return mealType.equals(DISH.getSize()) ? DISH_PRICE.getPrice() : SANDWICH_PRICE.getPrice();
    }

    private int calculateBeveragePrice(String beverageSize) {
        return switch (SizeEnum.fromSize(beverageSize)) {
            case SMALL -> SMALL_PRICE.getPrice();
            case MEDIUM -> MEDIUM_PRICE.getPrice();
            case LARGE -> LARGE_PRICE.getPrice();
            default -> 0;
        };
    }

    private int calculateDessertPrice(String dessertType) {
        if (dessertType.equals(NORMAL.getSize())) {
            return NORMAL_DESSERT_PRICE.getPrice();
        }
        if (dessertType.equals(SPECIAL.getSize())) {
            return SPECIAL_DESSERT_PRICE.getPrice();
        }
        return 0;
    }

    private int calculateCoffeePrice(String coffee, String mealType, String dessertSize, String beverageSize) {
        if (coffee.equals(YES.getSize()) &&
                mealType.equals(DISH.getSize()) &&
                beverageSize.equals(MEDIUM.getSize()) &&
                dessertSize.equals(NORMAL.getSize())) {
            return 0;
        }
        return COFFEE_PRICE.getPrice();
    }

}