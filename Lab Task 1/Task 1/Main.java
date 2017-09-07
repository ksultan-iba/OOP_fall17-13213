package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;

        import java.io.*; // Package for stream readers
public class Main {

    public static void main (String[]args) throws IOException
    {
        String first; // Person’s first name
        String last; // Person’s last name
        String middle; // Person’s middle initial
        String firstLast; // Name in first-last format
        String newform;
        String lastFirst; // Name in last-first format
        BufferedReader in; // Input stream for strings
        in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first name: "); // Prompt for first name
        first = in.readLine(); // Get first name
        System.out.print("Enter last name: "); // Prompt for last name
        last = in.readLine(); // Get last name
        System.out.print("Enter middle initial: "); // Prompt for middle initial
        middle = in.readLine(); // Get middle initial
        firstLast = first + " " + last; // Generate first format
        System.out.println("Name in first-last format is " + firstLast);
        lastFirst = last + ", " + first + ", "; // Generate second format
        System.out.println("Name in last-first-initial format is " +
                lastFirst + middle + ".");
        newform =  first +", "+ middle+", "+ last;
        System.out.println("Name in First-Middle-Last format is: " + newform );
    }
}