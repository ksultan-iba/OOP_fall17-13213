package com.company;


        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {



        String firstkid;
        String secondkid;
        String thirdkid;
        String fourthkid;
        String fifthkid;

        BufferedReader in; // Input stream for strings
        in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("My Grandmother's Trunk!");

        System.out.println("Name What goes in the trunk: ");
        firstkid= in.readLine();
        System.out.println("In my Grandmother's trunk "+firstkid+".");

        System.out.println("Name What goes in the trunk: ");
        secondkid= in.readLine();
        System.out.println("In my Grandmother's trunk "+firstkid+" and "+secondkid+".");

        System.out.println("Name What goes in the trunk: ");
        thirdkid= in.readLine();
        System.out.println("In my Grandmother's trunk "+firstkid+" and "+secondkid+" and "+ thirdkid+".");

        System.out.println("Name What goes in the trunk: ");
        fourthkid= in.readLine();;
        System.out.println("In my Grandmother's trunk "+firstkid+" and "+secondkid+" and "+ thirdkid+" and "+fourthkid+".");

        System.out.println("Name What goes in the trunk: ");
        fifthkid= in.readLine();;

        System.out.println("In my Grandmother's trunk "+firstkid+" and "+secondkid+" and "+ thirdkid+"and "+fourthkid+"and " +fifthkid+".");
    }
}