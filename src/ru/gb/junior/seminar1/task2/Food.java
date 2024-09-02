package ru.gb.junior.seminar1.task2;

/**
 * еда
 */
public interface Food extends Thing{
    // наличие белков
    Boolean getProteins();

    // наличие жиров
    Boolean getFats();

    // наличие углеводов
    Boolean getCarbohydrates();
}
