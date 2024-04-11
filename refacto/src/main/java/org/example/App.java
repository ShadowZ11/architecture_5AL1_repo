package org.example;

public class App {
    private static final String SMALL = "petit";
    private static final String MEDIUM = "moyen";
    private static final String LARGE = "grand";
    private static final String NORMAL = "normal";
    private static final String SPECIAL = "special";
    private static final String DISH = "assiette";
    private static final String YES = "yes";

    private static final int SMALL_PRICE = 2;
    private static final int MEDIUM_PRICE = 3;
    private static final int LARGE_PRICE = 4;
    private static final int NORMAL_DESSERT_PRICE = 2;
    private static final int SPECIAL_DESSERT_PRICE = 4;
    private static final int COFFEE_PRICE = 1;
    private static final int DISH_PRICE = 15;
    private static final int SANDWICH_PRICE = 10;

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
        return mealType.equals(DISH) ? DISH_PRICE : SANDWICH_PRICE;
    }

    private int calculateBeveragePrice(String beverageSize) {
        return switch (beverageSize) {
            case SMALL -> SMALL_PRICE;
            case MEDIUM -> MEDIUM_PRICE;
            case LARGE -> LARGE_PRICE;
            default -> 0;
        };
    }

    private int calculateDessertPrice(String dessertType) {
        if (dessertType.equals(NORMAL)) {
            return NORMAL_DESSERT_PRICE;
        }
        if (dessertType.equals(SPECIAL)) {
            return SPECIAL_DESSERT_PRICE;
        }
        return 0;
    }

    private int calculateCoffeePrice(String coffee, String mealType, String dessertSize, String beverageSize) {
        if (coffee.equals(YES) &&
                mealType.equals(DISH) &&
                beverageSize.equals(MEDIUM) &&
                dessertSize.equals(NORMAL)) {
            return 0;
        }
        return COFFEE_PRICE;
    }

}