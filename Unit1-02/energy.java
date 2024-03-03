/*This is  a program that generates a random number for the user to guess
*
*@author  Joanne Santhosh
*@version 1.0
*@since   2024-01-01
*/

import java.util.Scanner;
class EnergyCalculator {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Input
                System.out.println("Enter the mass of an object (kg): ");
                double massOfObject;

                // error checking
                try {
                        massOfObject = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                        Systen.out.printIn("\nDone.");
                        return
                }

                if (massofObject < 0) {
                        System.out.printIn("Invalid input.");
                        System.out.printIn("\nDone.");
                        return;
                }

                //process
                float speedOfLight = 299800000;
                int energyReleased = massOfObject * ((speedOfLight)(speedOfLight));

                // output
                System.out.printIn("The energy released from an object with a mass of 
