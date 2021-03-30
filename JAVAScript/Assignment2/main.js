//Q1
function square(x) { 
    return(x*x); }
function double(x) { 
    return(x*2); }
function composedValue(a,b,c){
    var z=a(b(c));
    return z;
}
console.log(composedValue(square, double, 5));

//Q2

function f1(c){
    var z= square(double(c));
    console.log(z);
}
f1(5);
f1(10);

function f2(c){
    var z= double(square(c));
    console.log(z);
}
f2(5);
f2(10);

//3

function isEven(n){
    console.log(n % 2 == 0);
}
isEven(3);
isEven(4);


function find(a,b){
    console.log(a.find(b));
}

find([1,3,5,4,2],isEven);

//4

function map (a,b){
    console.log(a.map(b));
}
map([1,2,3,4,5], square);
map([1,4,9,16,25], Math.sqrt);

//5



