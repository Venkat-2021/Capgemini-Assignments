var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
//1
var p1 = Promise.resolve(2);
var p2 = Promise.resolve(3);
Promise.all([p1, p2]).then(function (resolve) { var a = resolve.reduce(function (x, y) { return x + y; }); console.log(a); });
//2
var Account = /** @class */ (function () {
    function Account(accountId, accountName, accountBalance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        console.log(accountId, accountName, accountBalance);
    }
    return Account;
}());
var SavingAccount = /** @class */ (function (_super) {
    __extends(SavingAccount, _super);
    function SavingAccount(interest, accountId, accountName, accountBalance) {
        return _super.call(this, accountId, accountName, accountBalance) || this;
    }
    SavingAccount.prototype.getaccountBalance = function () {
        return this.accountBalance;
    };
    return SavingAccount;
}(Account));
var CurrentAccount = /** @class */ (function (_super) {
    __extends(CurrentAccount, _super);
    function CurrentAccount(cash_credit, accountId, accountName, accountBalance) {
        return _super.call(this, accountId, accountName, accountBalance) || this;
    }
    return CurrentAccount;
}(Account));
var ac = new SavingAccount(1, 5000, "Sai", 3000);
var ad = new CurrentAccount(2000, 111, "narsimha", 5000);
function totalBalance(ac, ad) {
    var totalBalance = ac.accountBalance + ad.accountBalance;
    console.log(totalBalance);
}
totalBalance(ac, ad);
var circle = {
    sayHi: function () { return "This is circle Object"; }
};
var employee = {
    sayHi: function () { return "This is employee Object"; }
};
function printAll(circle, employee) {
    console.log(circle.sayHi());
    console.log(employee.sayHi());
}
printAll(circle, employee);
