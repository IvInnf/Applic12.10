package Lesson_2;

public class Bananas {
    public static void main(String[] args) {
        // Голодный Вася съедает 3 банана за 9 минут, а сытый - за 15 минут
        // Насколько быстрее голодный Вася съедает один банан?

        int hungry = 9;
        int full = 15;
        int banana = 3;
        int oneHungry = hungry / banana;
        int oneFull = full / banana;
        int difference = oneFull - oneHungry;
        System.out.println(difference);

    }
}
