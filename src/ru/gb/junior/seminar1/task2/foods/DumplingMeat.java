package ru.gb.junior.seminar1.task2.foods;

import ru.gb.junior.seminar1.task2.SamiFinishedFood;

/**
 * пельмени
 */
public class DumplingMeat implements SamiFinishedFood {
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
        return "Пельмени";
    }
}
