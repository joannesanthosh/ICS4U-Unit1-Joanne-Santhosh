/*
* This is a  program that generates a random integer
* from one to six for the user to guess
*
* @author  Joanne Santhosh
* @version 1.0
* @since   2024-02-23
*/

import java.util.Scanner;

/**
* This is the program.
*/
final class DiceGame {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private DiceGame() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Generate random integer
        final int randomInt = 1 + (int) (Math.random() * ((6 - 1) + 1));

        // Guess loop
        int guesses = 1;
        while (true) {
            final Scanner input = new Scanner(System.in);
            // Check if input is valid
            try {
                System.out.print("Choose a number from 1 to 6: ");
                final int intGuess = Integer.parseInt(input.nextLine());
                final int amountMin = 1;
                final int amountMax = 6;
                if (intGuess >= amountMin && intGuess <= amountMax) {
                    // Amounts are valid between 1 and 6
                    if (intGuess == randomInt) {
                        // End loop
                        System.out.println("\nYou guessed correctly in "
                                            + guesses + " guess(es)."
                        );
                        input.close();
                        break;
                    } else if (intGuess > randomInt) {
                        System.out.println("Your guess is too high.\n");
                    } else if (intGuess < randomInt) {
                        System.out.println("Your guess is too low.\n");
                    }
                } else {
                    // Input is invalid
                    Integer.parseInt(null);
                }
            } catch (NumberFormatException nfe) {
                // Input is invalid
                System.out.println("Invalid input.\n");
            }
            guesses++;
        }

        // Show the program as done
        System.out.println("\nDone.");
    }
}
