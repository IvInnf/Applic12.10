package Practice;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

// Массив

int a = 5;
int b = 6;
int c = 7;
int [] triangle = {5, 6, 7};
        System.out.println("Стороны треугольника равны");
        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle[i]);
        }

int [] rectangle = new int [4];
// 4 ячейки
        System.out.println("Стороны прямоугольника равны");
        rectangle [0] = 2;
        rectangle [1] = 4;
        rectangle [2] = 3;
        rectangle [3] = 6;
        for (int side : rectangle){
            System.out.println(side);
        }
        String result = Arrays.toString(rectangle);
        System.out.println(result);
        Arrays.sort(rectangle);
        System.out.println(Arrays.toString(rectangle));
        // (Сортировать)

        int[] emptyArr = new int[10];
        System.out.println(Arrays.toString(emptyArr));
        Arrays.fill(emptyArr, 5);
        System.out.println(Arrays.toString(emptyArr));
        // (10 ячеек заполняется числами 5)

//Двухмерный

int [][] duoArr = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        System.out.println();
for (int[] line : duoArr) {
    for (int element : line) {
        System.out.print(element + " ");
    }
    System.out.println();
}

int [][] duoArr2 = new int[3][3];
duoArr2[0][0] = 1;
duoArr2[0][1] = 2;
duoArr2[0][2] = 3;
duoArr2[1][0] = 4;
duoArr2[1][1] = 5;
duoArr2[1][2] = 6;
duoArr2[2][0] = 7;
duoArr2[2][1] = 8;
duoArr2[2][2] = 9;

        System.out.println("");
        for (int i = 0; i < duoArr2.length; i++) {
            for (int j = 0; j < duoArr2[i].length; j++) {
                System.out.print(duoArr2[i][j] + " ");
                
            }
            System.out.println("");
        }

// Трехмерный

int[][][] triArr = {
        {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
        {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}}};

        //...






}}
