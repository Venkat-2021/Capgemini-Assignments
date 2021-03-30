"use strict";
exports.__esModule = true;
var message = "Welcome Back";
console.log(message);
function greetPerson(name) {
    var greet;
    if (name === "Chandlar") {
        greet = "Hello Chandler";
    }
    else {
        greet = "Hi there";
    }
    console.log(greet);
    //let greet; doesnot host decleration
}
greetPerson("Chandlar");
//block scope of let
var a = 1;
var b = 2;
if (a === 1) {
    var a = 10;
    console.log(a); //10
    console.log(b); //20
}
console.log(a); //10
console.log(b); //2
var c = 1;
var c = 2;
var d = 10;
var _loop_1 = function (i) {
    //if let is used we will get the correct out put
    setTimeout(function () { console.log(i); }, 1000); //display numbers after 1sec
};
//let d = 20; cannot declare
//display numbers
for (var i = 1; i <= 5; i++) {
    _loop_1(i);
}
var num1;
var num2 = 10;
var obj1 = {
    name: "Joatmon"
};
console.log(obj1.name);
obj1.name = "Chandler";
console.log(obj1.name);
var PI = 3.14;
var MAX_Size = 100;
//use let for reassign the let many times
var x = 5;
var y = 10;
x = x + y;
y = x - y;
x = x - y;
console.log(x);
console.log(y);
//Arrow functions
var getRegvalue = function () {
    return 10;
};
console.log(getRegvalue());
//convet above funtion to arrow
var getArrowvalue = function () { return 10; };
console.log(getArrowvalue());
var getArrowvalue2 = function (m) { return 10 * m; };
console.log(getArrowvalue2(5));
var getArrowvalue3 = function (m) { return 10 * m; };
console.log(getArrowvalue3(5));
var getArrowvalue4 = function (m, bonus) { return 10 * m + bonus; };
console.log(getArrowvalue4(5, 50));
var employee = {
    id: 1,
    greet: function () {
        var _this = this;
        setTimeout(function () { console.log(_this.id); }, 1000);
    }
};
employee.greet(); //1
var getValue = function (value) {
    if (value === void 0) { value = 10; }
    console.log(value);
};
getValue();
getValue(20);
//Rest Operator
var displayColours = function () {
    console.log();
    for (var i in arguments) {
        console.log(arguments[i]);
    }
};
//displayColours("Red");
//displayColours("Red","Blue");
//Object Literals
var firstname = "Chandler";
var lastname = "Bing";
var person = {
    firstname: firstname,
    lastname: lastname
};
console.log(person.firstname);
console.log(person.lastname);
