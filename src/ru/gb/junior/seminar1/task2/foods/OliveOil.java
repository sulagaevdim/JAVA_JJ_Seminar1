package ru.gb.junior.seminar1.task2.foods;

import ru.gb.junior.seminar1.task2.HealthyFood;

/**
 * оливковое масло
 */
public class OliveOil implements HealthyFood {
    @Override
    public Boolean getProteins() {
        return false;
    }

    @Override
    public Boolean getFats() {
        return true;
    }

    @Override
    public Boolean getCarbohydrates() {
        return false;
    }

    @Override
    public String getName() {
        return "Оливковое масло";
    }
}
