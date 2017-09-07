package com.company;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner h = new Scanner(System.in);

        System.out.println("The number is: (Should be greater than or equal to zero.)");
        int a,b=0;
        a=h.nextInt();


        for(int i=0; i<=a; i++)
            b = b + i ;
        System.out.println(b);
    }
}
