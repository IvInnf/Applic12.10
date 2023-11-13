package Lesson_4;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {

/**
 int ageIvan = 38;
 int ageVictor = 27;
 int ageAnton = 28;
 int ageIlya = 30;

 int[] ages = {ageIvan, ageVictor, ageAnton, ageIlya};
 System.out.println();

 int[] array1 = {11, 22, 33, 44, 55};
 System.out.println();

 int[] array2 = new int[5];
 array2[0] = 111;
 array2[1] = 222;
 array2[2] = 333;
 array2[3] = 444;
 array2[4] = 555;

 //  for (int i = 0; i < 5; i++) {
 //  System.out.println(array2[i]);
 //  }

 int[] array3 = new int[10];
 int lengthOfArray = array3.length;
 System.out.println("Длина массива равна " + lengthOfArray);

 for (int i = 0; i < 10; i++) {
 array3[i] = i;
 System.out.println(array3[i]);
 }
 for (int i = 0; i < array3.length; i++) {
 }

 int counter = 0;
 int[] array4 = new int[10];
 for (int i = 0; i <= 50; i++) {
 if (i % 5 == 0 && i !=0) {
 array4[counter] = i;
 counter++;
 }
 }
 for (int i = 0; i < array4.length; i++) {
 System.out.println(array4[i]);

 }

 int[] array5 = new int[10];
 int a = 90;
 for (int i = 0; i < array5.length ; i++) {
 array5[i] = a++;
 }
 for (int i = 0; i < array5.length; i++) {
 System.out.println(array5[i]);
 }

 int counter = 0;
 int[] array6 = new int[10];
 for (int i = 0; i <= 20; i++) {
 if (i % 2 != 0) {
 array6 [counter] = i;
 counter++;
 }
 }
 for (int i = 0; i < array6.length; i++) {
 System.out.println(array6[i]);

 }


 Scanner scanner = new Scanner(System.in);
 int[] array7 = new int[5];
 //   array7[0]  = scanner.nextInt();
 //   array7[1]  = scanner.nextInt();
 //   array7[2]  = scanner.nextInt();
 //   array7[3]  = scanner.nextInt();
 //   array7[4]  = scanner.nextInt();
 for (int i = 0; i < 5; i++) {
 array7[i] = scanner.nextInt();
 System.out.println(i);
 }
 for (int i = 0; i < array7.length; i++) {
 System.out.println(array7[i]);
 }
*/

        int[] lenina = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < lenina.length; i++) {
            lenina[i] = scanner.nextInt();
        }
        int nechetnie = 0;
        int chotnie = 0;
        for (int i = 0; i < lenina.length; i++) {
            if (i % 2 == 0) {
            chotnie = lenina[i] + chotnie;
            } else if (i % 2 != 0) {
                nechetnie = lenina[i] + nechetnie;
            }

            }
        if (chotnie > nechetnie) {
            System.out.println("Четных больше, чем нечетных");
        } else if (nechetnie > chotnie) {
            System.out.println("Нечетных больше, чем четных");
        } else {
            System.out.println("Одинаковое количество");
        }



    }
}

