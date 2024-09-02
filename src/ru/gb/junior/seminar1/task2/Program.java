package ru.gb.junior.seminar1.task2;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

/**
 * Техническое задание на разрабтку информационной системы Umarket
 * Вам доверено спроектировать и реализовать классы предменой области,
 * которые позволяют в дальнейшем вести разрабтку ИС со следующим функционалом:
 * 1. Осуществить учет продовольственных и непродовольственных товаров,которыми торгует UMarket
 *
 * 2. Предоставить покупателям возможность фильтрации продовольственных товаров по следующим видам:
 * - снеки
 * - полуфабрикаты
 * - продукты для приготовления
 * - все продовльственные товары
 *
 * 3. Формипровать онлайн корзину из продовльственных товаров
 * 4. Осуществлять балансировку онлайн корзины с целью получения такого набора продуктов питания,
 * который включает все основные питательные элементы
 *
 * Особенности бизнес-логики сервиса UMarket.
 *
 * Модуль онлайн покупок должен осуществлять контроль за попадающим в покупательскую корзину продуктами,
 * а именно:
 * - в онлайн корзину можно добавить только продовольственные товары
 * - в зависимости от желания покупателя, в онлайн корзине могут находиться как все присутствующие в
 * UMarket продовольственные товары, так и исключительно товары той категории, которую выбрал покупатель
 * посредством настроек фильтрации (фильтрация по видам продовольственных товаров)
 * Необходимо предусмотреть типобезопасность онлайн корзины, так как в момент автоматической балансировки
 * она должна пополняться продовольственными товарами из списка товаров UMarket СФУ
 * Необходимо учесть, что в случае формирования онлайн корзины конкретного вида продовольственных товаров,
 * дополнять корзину необходимо товарами именно из выбранной покупателем категории продовольственных товаров.
 *
 * С целью упрощения алгоритма балансировки онлайн корзины, будем считать, что каждый производственный
 * продукт содержит всего лишь один питательный элемент: белки / жиры / углеводы.
 * Следовательно, есть вероятность, что все выбранные товаары будут представителями одного и того же
 * питательного элемента (например, углеводными)
 * В свою очередь, балансировка делает так, чтобы в корзине были представлены все питательные элементы
 */

public class Program {
    private final static Scanner scaner = new Scanner(System.in);
    public static void main(String[] args) {
        UMarket market = new UMarket();
        System.out.println("Добро пожаловать в UMarket!");
        while (true){
            System.out.println("-------------------------------------");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("1 - Отобразить понлый список товаров");
            System.out.println("2 - Сформировать онлайн корзину из снеков");
            System.out.println("3 - Сформировать онлайн корзину из полуфабрикатов");
            System.out.println("4 - Сформировать онлайн корзину из продуктов для приготовления");
            System.out.println("5 - Сформировать онлайн корзину из любых продовольственных товаров");
            System.out.println("Выберите пункт меню: ");

            if (scaner.hasNextInt()) {
                int no = scaner.nextInt();
                scaner.nextLine();
                switch (no) {
                    case 0 -> {
                        System.out.println("Завершение работы приложения.");
                        return;
                    }
                    case 1 -> {
                        System.out.println("Список всех товаров:");
                        market.printThings(Thing.class);
                    }
                }
            } else {
                System.out.println("Некорректный пункт меню.\nПожалуйста, повторите попытку снова");
            }
        }
    }
}