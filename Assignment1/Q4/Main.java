package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome");

        int a=1, b=2, c=3;
        int numm;
        int num;
        double count;
        double rate;
        double time;
        double sec;

        System.out.println(" Enter \"1\" for instruction Set 1.");
        System.out.println(" Enter \"2\" for instruction Set 2.");
        System.out.println(" Enter \"3\" to end.");

        do {
            System.out.println("Enter your instruction number:");
            numm = in.nextInt();
            if(numm == 1){
                System.out.println("Enter the number of instructions:");
                num = in.nextInt();
                System.out.println("Enter the cycle count you want:");
                count = in.nextDouble();
                System.out.println("Enter the Rate (Mhz)");
                rate = 1/(in.nextDouble()* 1000000);
                time =( num * count * rate);
                System.out.println("The time required is: " + time + " seconds:");
            }
            else if(numm ==2){
                System.out.println("Enter the number of instructions:");
                num = in.nextInt();
                System.out.println("Enter the seconds required per instruction:");
                sec = in.nextDouble();
                time = (sec * num);
                System.out.println("The time required is: " + time + " seconds:");
            }
            //this seems unnecessary.. the else block.
            else{}

        }
        while ( numm != 3);

//class and javadoc missing furthermore there is a lot of code duplication. Try to avoid code duplicates; 
        //either break things in different methods or group the code in a mature logical workflow.


    }
}
