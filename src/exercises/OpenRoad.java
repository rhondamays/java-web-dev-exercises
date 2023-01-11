package exercises;

import java.util.Scanner;
public class OpenRoad {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven: ");
        int milesDriven = input.nextInt();

        System.out.println("How much gas have you consumed in gallons? ");
        int gasInGallons = input.nextInt();
        input.close();

        int mileage = milesDriven / gasInGallons;

        System.out.println("You have averaged " + mileage + " mile(s) per gallon");
    }
}
