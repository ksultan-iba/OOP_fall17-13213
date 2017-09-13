package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius (in floating point):");
                float r = scanner.nextFloat();
                Circle c = new Circle(r);

                System.out.println("For the area, type 'A'; for the circumference, type 'C'; for the diameter, type 'D'.");
                String req = scanner.next();

                double area = c.getArea();
                double circum = (2*3.14159265*r);
                double diam = 2*r;

                if(req.equalsIgnoreCase(("A")))
                System.out.println("The area of the circle with radius " + r + " is " + area);

                else if(req.equalsIgnoreCase("C"))
                System.out.println("The circumference of the circle with radius " + r + " is " + circum);

                else if(req.equalsIgnoreCase("D"))
                System.out.println("The diameter of the circle with radius " + r + " is " + diam);

                else
                System.out.println("You did not enter a valid letter. Enter your input again.");
    }
}