package OopsAssignment;

import java.util.Scanner;

public class Assignment2Q7 {
    static int candies = 0;
    static int cookies = 0;
    static int iceCreams = 0;
    int totalAmount = 0;
    Scanner s = new Scanner(System.in);
    Candy candy = new Candy();
    Cookie cookie = new Cookie();
    IceCream iceCream = new IceCream();

    public static void main(String[] args) {
        System.out.println("Welcome to ButterNuts!!!");
        Assignment2Q7 obj = new Assignment2Q7();
        obj.selectRoles();

    }
    private void selectRoles(){
        System.out.println("Select your Role(Choose Number) \n 1. Owner \n 2. Customer");
        //Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if (N == 1){
            String role = "Owner";
            roles(role);
        }
        else if (N == 2){
            String role = "Customer";
            roles(role);
        }
        else {
            System.out.println("Please Enter a Valid Input");
            selectRoles();
        }


    }
    private void roles(String role){
        if (role.equals("Owner")){
            addItems();
        }
        else if (role.equals("Customer")){
            placeOrder();
        }
        else {
            System.out.println("Please Enter a Valid Input");
            selectRoles();
        }

    }
    private void addItems(){
        System.out.println("The Available Stock: \n Candies: "+candies + " \n Cookies: "+cookies + "\n IceCreams: "+iceCreams);
        System.out.println("Select to Add Items: \n 1. Candies  \n 2. Cookies \n 3. IceCreams \n 4. Previous Menu \n 5. Exit");

        //Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if (N == 1){
            addItemsOperation(1);
        }
        else if (N == 2){
            addItemsOperation(2);
        }
        else if (N == 3){
            addItemsOperation(3);
        }
        else if (N == 4){
            addItemsOperation(4);
        }
        else if (N== 5){
            addItemsOperation(5);
        }


    }
    private void addItemsOperation(int choice){
        if (choice == 1){
            System.out.println("No. of Items: ");
            candies = s.nextInt();
            candy.addCandies(candies);
            //System.out.println("Added Candies");
            addItems();
        }
        else if (choice == 2){
            System.out.println("No. of Items: ");
            cookies = s.nextInt();
            cookie.addCookies(cookies);
            System.out.println("Added Cookies");
            addItems();
        }
        else if (choice == 3){
            System.out.println("No. of Items: ");
            iceCreams = s.nextInt();
            iceCream.addIceCream(iceCreams);
            System.out.println("Added IceCreams");
            addItems();
        }
        else if (choice == 4){
            selectRoles();
        }
        else if (choice == 5){
            System.exit(0);
        }



    }
    private void placeOrder(){
        if (candies != 0 || cookies != 0 || iceCreams != 0) {
            System.out.println("The Available Stock: \n Candies: " + candies + " \n Cookies: " + cookies + "\n IceCreams: " + iceCreams);
            System.out.println("Select Items to Purchase: \n 1. Candies  \n 2. Cookies \n 3. IceCreams \n 4. Previous Menu \n 5. Billing \n 6. Cancel Order");
            //Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            if (N == 1) {
                placeOrderOperation(1);
            } else if (N == 2) {
                placeOrderOperation(2);
            } else if (N == 3) {
                placeOrderOperation(3);
            } else if (N == 4) {
                selectRoles();
            }else if (N == 5){
                System.out.println("The Billing Amount is: "+totalAmount);
                System.out.println("ThankYou for buying..\n Visit Again :)");
                System.exit(0);
            } else if (N == 6) {
                System.out.println("Your Order has been Cancelled..! ");
                System.exit(0);
            }
        }
        else {
            System.out.println("OOP'S!....Contact Shop Owner to add Items ");
        }

    }
    private void placeOrderOperation(int choice){
        System.out.println("No. of Items: ");
        int items = s.nextInt();
        if (items != 0) {
            if (choice == 1){
                candies = candies - items;
                totalAmount += candy.getCost(items);
                placeOrder();
            }
            else if (choice == 2){
                cookies = cookies - items;
                totalAmount += cookie.getCost(items);
                placeOrder();
            }
            else if (choice == 3){
                iceCreams = iceCreams - items;
                totalAmount += iceCream.getCost(items);
                placeOrder();
            }
        }
        else {
            System.out.println("Please Select Items Again...");
            placeOrder();
        }

    }


}
abstract class DesertItem{
    abstract public int getCost(int item);
}
class Candy extends DesertItem{
    public int addCandies(int candies ){
        return candies;
    }
    @Override
    public int getCost(int candies){
        int candyCost;
        int dollar = 60;
        candyCost = dollar * candies;
        return candyCost;

    }
}
class Cookie extends DesertItem{
    public int addCookies(int cookies){
        return cookies;
    }
    @Override
    public int getCost(int cookies){
        int cookieCost;
        int euro = 70;
        cookieCost = euro*cookies;
        return cookieCost;

    }
}
class IceCream extends DesertItem{
    public int addIceCream(int iceCream){
        return iceCream;
    }
    @Override
    public int getCost(int iceCreams){
        int iceCreamCost;
        int rupees = 65;
        iceCreamCost = rupees*iceCreams;
        return iceCreamCost;

    }
}