package ru.gb.junior.seminar1.task2.foods;

import ru.gb.junior.seminar1.task2.Snack;

/**
 * шоколадный батончик
 */

public class ChocolateBar implements Snack {
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
        return "Шоколадный батончик";
    }
}
