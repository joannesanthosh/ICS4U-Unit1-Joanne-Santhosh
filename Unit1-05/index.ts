/*This is a program that uses a function to calculate the length of wood
*
*@author  Joanne Santhosh
*@version 1.0
*@since   2024-01-01
*/

import { createPrompt } from 'bun-promptx'

function BoardFoot(width = number, height = number) {
  const volume = 144 
  const length = volume / (width * height) 
  return length
}

function main() {
// Input
  const widthString = createPrompt("Enter the width of the piece of wood (in inches): ")
  const heightString = createPrompt("Enter the height of the piece of wood (in inches): ")

  const width = parseFloat(widthString.value)
  const height = parseFloat(heightString.value) 

  // Error checking

  if (isNaN(width) || isNaN(height) || width <= 0 || height <= 0) {
    console.log("\nInvalid input. Width and height must be positive numbers.\n")
    return
  }

  // Calculate length using the BoardFoot function
  const length = BoardFoot(width, height)

  // Output
  console.log(`To make exactly 1 board foot of wood, the length should be ${length.toFixed(1)} inches.`)
  console.log(`\nDone.`)
}

// Call main function
main()
