import java.util.Scanner;

class GasCalculator {
    void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter gallons of gas in the tank: ");

        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid input.");
            return;
        }

        double gallons = input.nextDouble();

        System.out.print("Enter fuel efficiency in miles per gallon: ");

        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid input.");
            return;
        }

        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price of gas per gallon: ");

        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid input.");
            return;
        }

        double pricePerGallon = input.nextDouble();

        if (gallons <= 0 || milesPerGallon <= 0 || pricePerGallon <= 0) {
            System.out.println("Error: Values must be greater than zero.");
            return;
        }

        double costPer100Miles = (100 / milesPerGallon) * pricePerGallon;
        double distance = gallons * milesPerGallon;

        System.out.println("Cost per 100 miles: " + costPer100Miles);
        System.out.println("Distance the car can travel: " + distance + " miles");
    }
}