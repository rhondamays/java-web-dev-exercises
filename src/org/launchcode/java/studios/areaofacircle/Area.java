package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");

        if(!input.hasNextDouble()) {
            System.out.println("The radius must be a valid number");
            return;
        }

        double radius = input.nextDouble();

        while (radius <= 0) {
            System.out.println("Please enter a number greater than 0: ");
            radius = input.nextDouble();
        }
        System.out.println("The area of the circle is: " + Circle.getArea(radius));
    }
}
