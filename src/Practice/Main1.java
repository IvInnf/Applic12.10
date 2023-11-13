package Practice;

public class Main1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        if (a == b) {
            System.out.println("a == b");
        } else if (a > b) {
            System.out.println("a > b");

        } else {
        System.out.println("a < b");


    }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {


            System.out.println("i = " + i + " j = " + j );
        }
}
        boolean isAequealesB = false; {
    while (!isAequealesB) {
        System.out.println("a < b, " + a + " < " + b);
        a = a +1;
        if (a == b) {
            isAequealesB = true;
        }



    }
        System.out.println("a = b, " + a + " = " + b);
}
        System.out.println("Do while ---");
        a = 5;
    do {
        System.out.println("a < b, " + a + " < " + b);
        a = a +1;
    }  while (a < b);
        System.out.println("a = b, " + a + " = " + b);

        System.out.println("444");

       Long counter = 0L;
       a=2;
       b=1;
        while (a > b) {
       counter++;
        }
        System.out.println(counter.toString());
    }
}
