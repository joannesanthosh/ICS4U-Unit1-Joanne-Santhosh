/* 
* This is a program that generates a random number for the user to guess
*
* @author  Joanne Santhosh
* @version 1.0
* @since   2024-01-01
*/

import { createPrompt } from 'bun-promptx'

// input
const userGuessString = createPrompt("Guess a number between 1 - 6:")
const randomNumber = Math.floor(Math.random() * 6)
let guesses = 0

// error checking
const userGuess = parseFloat(userGuessString.value || "-1")
if (isNaN(userGuess) == true || userGuess < 0) {
  console.log("Invalid input.")
} else {

// process
guesses += 1
if (userGuess > randomNumber) {
  console.log("Your guess is too high. Try again.")
} else if (userGuess < randomNumber);
  console.log("Your guess is too low. Try again.")
}
while (userGuess != randomNumber)


// output
console.log("You correctly guessed the number ${randomNumber} in ${guesses} tries!")
console.log("\nDone.")
