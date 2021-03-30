//1
let p1=Promise.resolve(2);
let p2=Promise.resolve(3);
Promise.all([p1,p2]).then(resolve=>{var a=resolve.reduce((x,y)=>x+y); console.log(a)})

//2
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

function totalBalance(ac, ad){
    let totalBalance = ac.accountBalance+ad.accountBalance;
    console.log(totalBalance);
}

totalBalance(ac,ad);

//3
interface Printable {
    sayHi: ()=>string;
}

var circle:Printable = {
    sayHi:():string => {return "This is circle Object"}
}

var employee:Printable = {
    sayHi:():string => {return "This is employee Object"}
}

function printAll(circle,employee){
    console.log(circle.sayHi())
    console.log(employee.sayHi())
}

printAll(circle,employee);

