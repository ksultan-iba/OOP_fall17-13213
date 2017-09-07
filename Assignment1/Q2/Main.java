package com.company;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner h=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a, b=1;
        a=h.nextInt();
        if(a<0)
            System.out.println("Non negative number.");

        else;

        for(int i=1;i<=a;i++){
            b=b*i;
        }
        System.out.println("The factorial of " + a + " is: " + b);
    }
}