package Homework;

import java.util.Scanner;

public class D {


    public static void main(String[] args) {
        int[] array = new int[40];
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();

        if(a>b){
            int z = a;
            a = b;
            b = z;
        }


        for(int i=0;i<40;i++) {
            int randoms = (int) (Math.random() * (b - a + 1) + a);
            array[i] = randoms;
        }


        int Even = 0;
        int Odd = 0;

        int Even_sum = 0;
        int Odd_sum = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                Even++;
                Even_sum += i;
            } else {
                Odd++;
                Odd_sum += i;
            }
        }


        System.out.println("Evens " + Even);
        System.out.println("Odd " + Odd);
        System.out.println("Even_sum " + Even_sum);
        System.out.println("Odd_sum " + Odd_sum);



    }

}
