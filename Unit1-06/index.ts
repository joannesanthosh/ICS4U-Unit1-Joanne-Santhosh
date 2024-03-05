/* This program uses arrays to find the mean and median of a set of numbers
*
*@author  Joanne Santhosh
*@version 1.0
*@since   2024-01-01
*/

import { createPrompt } from 'bun-promptx'

// get arguments
//
import { readFileSync } from 'fs';
//
// print process.argv
process.argv.forEach(function (val, index, array) {
  console.log(index + ': ' + val)
})

console.log(process.argv[2])


const file = readFileSync(process.argv[2], 'utf8')
console.log(file)

const newArray = file.split(/\r?\n/)
// pop last element, since it will be empty (the EOF)
newArray.pop()
console.log(newArray)
