const inputString = prompt("Enter numbers separated by spaces:");
const inputArray = inputString.split(' ');
const numbers = inputArray.map(Number);

if (!inputString || numbers.some(isNaN)) {
  console.log("Invalid input. Please enter valid numbers separated by spaces.");
} else {
  numbers.sort((a, b) => b - a);

  console.log("Sorted array in descending order:", numbers);
}