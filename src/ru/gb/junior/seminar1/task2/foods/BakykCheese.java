package ru.gb.junior.seminar1.task2.foods;

import ru.gb.junior.seminar1.task2.Snack;

/**
 * Сыр балыковый (балык)
 */

public class BakykCheese implements Snack {
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
        return "Сыр (Балык)";
    }
}
