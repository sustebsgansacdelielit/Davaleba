package Homework;

import java.util.Scanner;

public class C {
    int a;
    int b;
    int c;

    public void initial(){
        Scanner number = new Scanner(System.in);
        a = number.nextInt();
        b = number.nextInt();
        c = number.nextInt();
    }

    int method_two;
    public int lastNumber(){
        method_two = a % 10;
        return method_two;
    }


    int method_three;
    public int firstNumber(){
        int nashti = 0;
        while(b>0){
            nashti = b % 10;
            b /= 10;
        }
        method_three = nashti;
        return method_three;
    }

    int method_four;
    public int sum_numbers(){
        int nashti = 0;
        int sum = 0;
        while(c>0){
            nashti = c % 10;
            c /= 10;
            sum += nashti;
        }
        method_four = sum;
        return method_four;
    }

    int method_five;
    public void method_multiple(){
        method_five = method_two * method_three;
        System.out.println(method_five);
    }

    public void sum(){
        System.out.println(method_three + method_five);
    }


    public static void main(String[] args) {
        C x = new C();
        x.initial();

        System.out.println("last number(a)- " + x.lastNumber());
        System.out.println("first number(b)- " + x.firstNumber());
        System.out.println("jami(c)- " + x.sum_numbers());

        x.method_multiple();
        x.sum();



    }
}

