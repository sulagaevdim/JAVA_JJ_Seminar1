package ru.gb.junior.seminar1.task2.foods;

import ru.gb.junior.seminar1.task2.SamiFinishedFood;

/**
 * чебурек
 */

public class Cheburek implements SamiFinishedFood {
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
        return "Чебурек";
    }
}
