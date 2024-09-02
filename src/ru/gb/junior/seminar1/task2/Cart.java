package ru.gb.junior.seminar1.task2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * корзина
 * @param <T> Еда
 */

public class Cart <T extends Food>{

    private final ArrayList<T> foodstuffs;
    private final UMarket market;
    private final Class<T> clazz;

    public Cart(Class<T> clazz, UMarket market) {

        this.market = market;
        this.clazz = clazz;
        this.foodstuffs = new ArrayList<>();
    }

    public ArrayList<T> getFoodstuffs() {
        return foodstuffs;
    }
    public void printFoodStuffs(){
        AtomicInteger index = new AtomicInteger(1);
        foodstuffs.forEach(food -> {
            System.out.printf("[%d] %s (Белки: %s Жиры: %s Углеводы: %s)\n",
                    index.getAndIncrement(), food.getName(),
                    food.getProteins() ? "Да" : "Нет",
                    food.getFats() ? "Да" : "Нет",
                    food.getCarbohydrates() ? "Да" : "Нет");
        });
    }
}
