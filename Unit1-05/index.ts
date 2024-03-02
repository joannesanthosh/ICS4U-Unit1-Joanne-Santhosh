/*This is a program that generates a random number for the user to guess
*
*@author  Joanne Santhosh
*@version 1.0
*@since   2024-01-01
*/

import { createPrompt } from 'bun-promptx'

function main() {
  const width = createPrompt("Enter the width in inches : ")
  const height = createPrompt("Enter the height in inches: ")
}

// error checking
   if (isNaN(width) || isNaN(height)) {
    console.log("invalid input")
    return
   }

// calculation
   const calculateLength = BoardFoot(width, height)

function BoardFoot {
  const volume = 144
  const length = volume / (width * height)
  return length
}

// output
   console.log(`The length needed to make one Board Foot of wood is ${length}.`)
   console.log(`\nDone.`)

// call main function
main()
