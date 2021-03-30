//Q1
class Rectangle{
    width;
    height;
    constructor(width,height){
        this.width = width;
        this.height = height;
    }
    
}
let rectangle = new Rectangle(4,5);
console.log(rectangle.width);
console.log(rectangle.height);
//Make Some Changes to above class 

rectangle.height = 60;

console.log(rectangle.width);
console.log(rectangle.height)

//Q2
rectangle.getArea = function(){
    return this.height * this.width;
}
console.log(rectangle.getArea())

//Q3
rectangle.height = 50;
console.log(rectangle.getArea());

//Q4
var obj = {
     firstName:"SAI",
     lastName:"THAMMANA"}

console.log(obj.firstName);
console.log(obj.lastName);

obj.lastName = "GUPTA"
console.log(obj.lastName);

//5

obj.middleName="NARSIMHA"
console.log(obj.middleName);

//6
var string = ({"firstName":"SAI","lastName":"GUPTA"})
var json = eval(string)
console.log(json);
console.log(json.firstName);
console.log(typeof(json));

//7
var string = ({"firstName":"SAI","lastName":"GUPTA"})
var real = JSON.parse('{"firstName":"SAI","lastName":"GUPTA"}')
console.log(real);
console.log(typeof(real));




