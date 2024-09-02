package ru.gb.junior.seminar1.task2.foods;

import ru.gb.junior.seminar1.task2.HealthyFood;

/**
 * курица
 */

public class Chicken implements HealthyFood {
    @Override
    public Boolean getProteins() {
        return true;
    }

    @Override
    public Boolean getFats() {
        return false;
    }

    @Override
    public Boolean getCarbohydrates() {
        return false;
    }

    @Override
    public String getName() {
        return "Курица";
    }
}
