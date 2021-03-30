//Assignment 1Q
function parity(n){
    if(n % 2 == 0){
        console.log ("EVEN");
    }
    else console.log("ODD");
}

parity(1);
parity(2);

//Q2
function max(a, b, c){
    console.log (Math.max(a,b,c));
}

max(1,2,3);
max(1,3,2);
max(3,2,1);

//Q3

function numHeads(n) {  
    var heads = 0;
    var  tails = 0;
    for(var i=0;i<n;i++){
        x=Math.random;

        (Math.floor(Math.random() * 2) == 0) ? heads++:tails++;
    }
    return console.log(heads);

}

numHeads(10);
numHeads(10);
numHeads(10);

//4

function headRatio(n) {  
    var heads = 0;
    var  tails = 0;
    for(var i=0;i<n;i++){
        x=Math.random;

        (Math.floor(Math.random() * 2) == 0) ? heads++:tails++;
    }
   console.log(heads/n);

}

headRatio(10);
headRatio(10);
headRatio(10000);
headRatio(10000000);

//5

function padChars(n, a){
    if(n > 0){
        console.log(a.repeat(n));
    }
}

padChars(5,"x");
padChars(7,"_");

//6 in HTML

//7
var fourNums= [];
while(fourNums.length<4){
var x=Math.random();
    fourNums.push(x);
}
 console.log(fourNums);
//8
var hundredNums= [];
while(hundredNums.length<100){
var x=Math.random();
    hundredNums.push(x);
}
 console.log(hundredNums);

//9

var strings = ["1.2", "2.3", "3.4"];

function numberArray(array){
    for( var i=0; i<array.length; i++){
    array[i]=parseFloat(array[i]);
    }
    return array;
}

var nums=numberArray(strings);
console.log(nums);
//10
var x = 5
console.log(x);
//11
function half(x){
    console.log(x/2);
}
half(4);
half(x);
half(3);

//12 Write a function that returns the largest element in a list.
const array = [1, 3, 2];

console.log(Math.max(...array));

//13Write function that reverses a list, preferably in place.
function reverseArrayInPlace(arr) {
    for (var i = 0; i <= (arr.length / 2); i++) {
        let el = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = el;
    }
    console.log(arr);
}
reverseArrayInPlace([1,2,5,]);

//14Write a function that returns the largest element in a list.

function largestOfArray(array1) {
    let answer = []
    for (let i = 0; i < array1.length; i++) {
      answer.push(Math.max(...array1))
    }
    console.log(answer);
  }
  array1 = [1,2,3,4,]
  largestOfArray(array1);

//15Write a function that concatenate two lists.

let a = [0, 1, 2];
let b = [3, 5, 7];
let c = a.concat(b);
console.log(c);

//16 Write a program that asks the user for a number n and prints the sum of
//the numbers 1 to n

const number = 100;
let sum = 0;

for (let i = 1; i <= number; i++) {
    sum += i;
}
console.log(sum);

//17Write a program that prints all prime numbers
const a1 = 1;
const b2 = 20;

for (let i = a1; i <= b2; i++) {
    let flag = 0;

    for (let j = 2; j < i; j++) {
        if (i % j == 0) {
            flag = 1;
            break;
        }
    }
    // if number greater than 1 and not divisible by other numbers
    if (i > 1 && flag == 0) {
        console.log(i);
    }
}

//18 