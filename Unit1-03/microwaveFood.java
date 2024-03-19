/* This program calculates the energy an object can release
*
* @author  Joanne Santhosh
* @version 1.0
* @since   2024-02-20
*/

import java.util.Scanner;

/**
* This is the program.
*/
final class microwaveFood {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private microwaveFood() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /*
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Timers in seconds
        final int pizzaTimer = 45;
        final int subTimer = 60;
        final int soupTimer = 105;

        System.out.println("Time to microwave sub, pizza or soup!");

        // Get input
        final Scanner input = new Scanner(System.in);
        System.out.print("Select food to microwave: ");
        float foodTimeTotal = 0;
        final String foodString = input.nextLine();
        // Set the food time to microwave one
        if ("pizza".equals(foodString)) {
            foodTimeTotal = pizzaTimer;
        } else if ("sub".equals(foodString)) {
            foodTimeTotal = subTimer;
        } else if ("soup".equals(foodString)) {
            foodTimeTotal = soupTimer;
        }

        final Scanner inputTwo = new Scanner(System.in);
        // Check if the food time was set
        if (foodTimeTotal != 0) {
            // Check if input is valid
            try {
                System.out.print("Select amount of food (max 3): ");
                final int foodAmount = Integer.parseInt(inputTwo.nextLine());
                final int amountMin = 1;
                final int amountMax = 3;
                if (foodAmount >= amountMin && foodAmount <= amountMax) {
                    // Amounts are valid between 1 and 3
                    final float foodPercent = (float) (
                        1 + (0.5 * (foodAmount - 1))
                        );
                    foodTimeTotal = foodTimeTotal * foodPercent;
                    final float foodTimeMinutes = (float) Math.floor(
                        foodTimeTotal / 60
                        );
                    final float foodTimeSeconds = foodTimeTotal - (
                        60 * foodTimeMinutes
                        );
                    System.out.println(
                        "Total cook time for " + foodAmount + " " + foodString
                        + "(s) is " + foodTimeMinutes + " minute(s) and "
                        + foodTimeSeconds + " seconds."
                    );
                } else {
                    // Input is invalid
                    Integer.parseInt(null);
                }
            } catch (NumberFormatException e) {
                // Input is invalid
                System.out.println("Invalid input.");
            }
        } else {
            // Input is invalid
            System.out.println("Invalid choice.");
        }

        // Close scanners
        input.close();
        inputTwo.close();

        // Show the program as done
        System.out.println("\nDone.");
    }
}
