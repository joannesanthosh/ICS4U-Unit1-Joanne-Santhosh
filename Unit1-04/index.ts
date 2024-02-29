/* 
* This is a program that generates a random number for the user to guess
*
* @author  Joanne Santhosh
* @version 1.0
* @since   2024-01-01
*/

import { createPrompt } from 'bun-promptx'

// input
const randomNumber = Math.floor(Math.random() * 6)
let guesses: number = 0

// while loop
while (true) {
  const userGuessString = prompt("Guess a number between 1 - 6:")
  if (userGuessString == null) {
    break 
}
  const userGuessInt = parseInt(userGuessString)
  if (isNaN(userGuessInt) == true || userGuessInt < 0) {
   console.log("\nInvalid input.")
} else {
// process
guesses++
if (userGuessInt !== randomNumber) {
  if (userGuessInt < randomNumber) {
    console.log("Your guess is too low. Try again.")
  } else {
    console.log("Your guess is too high. Try again.")
  }
} else {
  console.log(`You correctly guessed the number in ${guesses} tries!`)
  break
  }
 }
}
console.log("\nDone.")
