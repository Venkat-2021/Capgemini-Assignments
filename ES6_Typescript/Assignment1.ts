export {}

//1
const x = 10;
console.log(x);//10

//const a = 20; throughs an error

//2
var a=1;
var b=2;
if(a === 1){
    var a = 10;
    b = 20;
    console.log(a);//10
    console.log(b);//20
}
console.log(a);//10
console.log(b);//2 cannot access ouside the block

//3
let Order = {
    id: 101 ,
    title: "Book",
    price: 300,

    printorder(){
         return this.title
    },
    getPrice(){
        return this.price
    },
    
};

console.log(Order.printorder());
console.log(Order.getPrice());
var obj = Object.assign(Order,{});
console.log(obj); 

//4
let abc =[];

let names = ["Tom","lvan","Jerry"];

var xyz=(names) => {
    for(let i in names){
        let x ="{"+"names:"+names[i]+",length:"+names[i].length+"}";
        abc.push(x);
    }
}
console.log(abc);

//5
//a
function add(a, b) {
    return a + b;
};

console.log(add(5,2));

//b
var userName = "Narsimha";
var friends = ['Sai', 'Venkat','Gupta'];

function userFriends(userName, friends){
    console.log("Name is:"+userName+"\n Friends are:");
    for (var friend in friends){
        console.log(friends[friend]);
    }
};
userFriends(userName,friends);

//c

var cities = ['Hyderabad','Mumbai','Delhi','Jaipur','Nagpur'];

function capitalNames(){
    var fiveNames = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        fiveNames[_i] = arguments[_i];
    }
    for (var i in fiveNames) {
        console.log(fiveNames[i].toUpperCase());
    }
}
capitalNames.apply(void 0,cities);

//6 Template Literals
let laptopModel = "Hp Pavillion";
let deskNo = 101;
let name = "Sai";

console.log(`Customer Name: ${name},
with Desktop Number: ${deskNo},
Laptop Model: ${laptopModel} `);

// 7  De-structuring

//a 

var arr1 = ['Hyderabad','Mumbai','Delhi','Jaipur'];
console.log(arr1[3]);

//b

const Obj = {
    name: "Narsimha",
    address:{
        city:'Hyderabad',
        state:'Telangana',
        pincode:501301
    }
}
console.log(Obj.address.pincode); //get pincode 501301

//8

class Account{
    accountId: number;
    accountBalance: number;
    accountName: number;
    
    constructor(accountId,accountName,accountBalance){
       this.accountId=accountId;
       this.accountName=accountName;
       this.accountBalance=accountBalance;
       console.log(accountId,accountName,accountBalance);
    }
    
}
class SavingAccount extends Account{

   constructor(interest,accountId,accountName,accountBalance){
       super(accountId,accountName,accountBalance);
   }
   public getaccountBalance(){
       return this.accountBalance
   }
}
class CurrentAccount extends Account{
   constructor(cash_credit,accountId,accountName,accountBalance){
       super(accountId,accountName,accountBalance);
   }
}

let ac =new SavingAccount(1,5000,"Sai",3000);
let ad=new CurrentAccount(2000,111,"narsimha",5000);

//let acc=ac.accountBalance+ad.accountBalance
//console.log(acc);
function totalBalance(ac, ad){
    let totalBalance = ac.accountBalance+ad.accountBalance;
    console.log(totalBalance);
}

totalBalance(ac,ad);