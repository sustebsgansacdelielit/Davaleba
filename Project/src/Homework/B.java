package Homework;

import java.util.Scanner;

public class B extends A {

    int y;
    protected void initial_y(){
        Scanner input = new Scanner(System.in);
        y = input.nextInt();
    }

    protected int sum2(){
        return y + x;
    }



}
