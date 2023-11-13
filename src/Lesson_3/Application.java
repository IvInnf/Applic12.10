package Lesson_3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /**
         Операторы сравнения:

         == Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным (A == B)

         != Проверяет, равны или нет значения двух операндов, если значения
         не равны, то условие ставится истинным (A != B)

         > Проверяет, является ли значение левого операнда больше, чем правого,
         если да, то условие становится истинным (A > B)

         < Проверяет, является ли значение левого операнда меньше, чем правого,
         если да, то условие становится истинным (A < B)

         >=  Проверяет, является ли значение левого операнда больше или равно
         значени правого, если да, то условие становится истинным (A >= B)

         <= Проверяет, является ли значение левого операнда меньше или равно
         значению правого, если да, то условие становится истинным (A <= B)

         (= - оператор присвоения)

         */


        int a = 5;
        int b = 10;
        boolean c = a != b;
        System.out.println(c);


        /**
         Логические операторы:
         && - логический оператор "И". Если оба операнда не равны нулю, то условие становится истинным
         || - логический оператор "ИЛИ". Если любой из двух операндов не равен нулю, то условие становится истинным
         ! - логический оператор "НЕ". Использование меняет логическое состояние своего операнда
         Если условие имеет значение true, то оператор логического "НЕ" будет делать folse

         */
        // 2 условия. Если оба совпадают, тогда true, если одно не совпадает, тогда folse
        boolean bull1 = 10 > 5 && 15 < 10;
        System.out.println(bull1);

        boolean bull2 = 100 > 50 || 50 < 100;
        System.out.println(bull2);
        System.out.println(!bull2);

        /**
         if (условие) {
         // Действия, которые выполняются, если условие истинно;
         }
         else (условие) {
         // Действия, которые выполняются, если условие истинно;
         }
         Если условие if не срабатывает, срабатывает условие else

         */
        int age = 11;

        if (age > 14) {
            System.out.println("Ок, проходите на фильм");
        } else {
            System.out.println("Нет, на фильм нельзя");
        }


        int height = 221;

        if (height > 125 && height < 220) {
            System.out.println("Да, можно на американские горки");
        } else {
            System.out.println("Нет, нельзя пройти");
        }


        /**       int day = 5;
         if (day == 1) {
         System.out.println("Понедельник");
         } else if (day == 2) {
         System.out.println("Вторник");
         } else if (day == 3) {
         System.out.println("Среда");
         } else if (day == 4) {
         System.out.println("Четверг");
         } else if (day == 5) {
         System.out.println("Пятница");
         } else if (day == 6) {
         System.out.println("Суббота");
         } else if (day == 7) {
         System.out.println("Воскресенье");
         } else {
         System.out.println("Неизвестный день");
         }

         /**   [(Switch case)]
         Switch (ВыражениеДляВыбора) {
         case (Значение1):
         Код1;
         break;
         ...
         case (ЗначениеN):
         КодN;
         break;
         }
         */

        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

        switch (day) {
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятница");
                break;
            case (6):
                System.out.println("Суббота");
                break;
            case (7):
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неизвестный день");
                break;

        }

        Scanner ss = new Scanner(System.in);
        int temp = ss.nextInt();
        switch (temp) {
            case (-15):
                System.out.println("Холодно");
                break;
            case (0):
                System.out.println("Прохладно");
                break;
            case (15):
                System.out.println("Тепло");
            default:
                System.out.println("Сегодня непонятная погода");
        }


        int rate = 7;
        if (rate == 5) {
            System.out.println("Отлично");
        } else if (rate == 4) {
            System.out.println("Хорошо");
        } else if (rate == 3) {
            System.out.println("Удовлетворительно");
        } else if (rate == 2) {
            System.out.println("Неудовлетворительно");
        } else if (rate == 1) {
            System.out.println("Плохо");
        } else {
            System.out.println("Непонятно");
        }

        // Ctr+Alt+L - форматирование текста на странице


        int s = 75;
        if (s < 50 || s > 100) {
            System.out.println("Число не попадает в диапозон от 50 до 100 ");
        } else {
            System.out.println("Число попадает в диапозон от 50 до 100");
        }


    }
}
