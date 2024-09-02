package ru.gb.junior.seminar1.task2.foods;

import ru.gb.junior.seminar1.task2.Snack;

/**
 * чипсы
 */
public class Crisps implements Snack {
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
        return "Чипсы";
    }
}
