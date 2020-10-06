package Homework;

import java.util.Scanner;

public class A {
    int x;

    public A(){
        System.out.println("Hello World");
    }

    public void initial_x(){
        Scanner num = new Scanner(System.in);
        x = num.nextInt();
    }


    public void sum(){
        System.out.println(x+12);
    }


    public void shemowmeba(){
        if(x % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }


    public static void main(String[] args) {
        B object = new B();
        object.initial_x();
        object.sum();
        object.shemowmeba();

        object.initial_y();
        System.out.println(object.sum2());





    }
}

