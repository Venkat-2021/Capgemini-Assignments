export{}
let message = "Welcome Back";
console.log(message);

function greetPerson(name){
    let greet;
    if(name === "Chandlar"){
          greet = "Hello Chandler";
    }else{
          greet = "Hi there";
    }
    console.log(greet);
    //let greet; doesnot host decleration
}
greetPerson("Chandlar");

//block scope of let
var a=1;
var b=2;
if(a === 1){
    var a = 10;
    
    console.log(a);//10
    console.log(b);//20
}
console.log(a);//10
console.log(b);//2

var c = 1;
var c = 2;

let d = 10;
//let d = 20; cannot declare

//display numbers

for(let i =1; i<=5; i++){// if var is used first loop will execute we will get exit statement
    //if let is used we will get the correct out put
    setTimeout(function(){console.log(i);},1000);//display numbers after 1sec
}

let num1;

const num2 = 10;

const obj1 = {
    name:"Joatmon"
};
console.log(obj1.name);

obj1.name = "Chandler"

console.log(obj1.name)

const PI = 3.14;
const MAX_Size = 100;

//use let for reassign the let many times
let x = 5;
let y = 10;

x = x+y;
y = x-y;
x = x-y;

console.log(x);
console.log(y);

//Arrow functions
var getRegvalue = function(){
    return 10;
}
console.log(getRegvalue());

//convet above funtion to arrow

const getArrowvalue = () => 10;
console.log(getArrowvalue());

const getArrowvalue2 = (m) => 10*m;
console.log(getArrowvalue2(5));

const getArrowvalue3 = m => 10*m;
console.log(getArrowvalue3(5));

const getArrowvalue4 = (m,bonus) => 10*m+bonus;
console.log(getArrowvalue4(5,50));

var employee = {
    id: 1,
    greet: function(){
        
       setTimeout(() => {console.log(this.id);},1000); 
    }
};
employee.greet();//1

let getValue = function(value = 10){
    console.log(value);
};
getValue();
getValue(20);

//Rest Operator
let displayColours = function(){
    console.log()
    for (let i in arguments){
        console.log(arguments[i]);
    }
}

//displayColours("Red");
//displayColours("Red","Blue");

//Object Literals
 let firstname = "Chandler";
 let lastname = "Bing";

 let person = {
     firstname,
     lastname
 };

 console.log(person.firstname);
 console.log(person.lastname);

