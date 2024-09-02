package ru.gb.junior.seminar1.task2.foods;

import ru.gb.junior.seminar1.task2.HealthyFood;

/**
 * фрукт
 */
public class Fruit implements HealthyFood {
    @Override
    public Boolean getProteins() {
        return false;
    }

    @Override
    public Boolean getFats() {
        return false;
    }

    @Override
    public Boolean getCarbohydrates() {
        return true;
    }

    @Override
    public String getName() {
        return "Фрукт";
    }
}
