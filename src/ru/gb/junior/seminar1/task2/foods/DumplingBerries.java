package ru.gb.junior.seminar1.task2.foods;

import ru.gb.junior.seminar1.task2.SamiFinishedFood;

/**
 * замороженные ягоды
 */
public class DumplingBerries implements SamiFinishedFood {
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
        return "Замороженные ягоды";
    }
}
