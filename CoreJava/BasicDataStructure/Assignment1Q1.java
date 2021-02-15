package DataStructure;

import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num){
        int temp = num, sum =0;

        while (temp>0){
            int x =temp % 10;
            sum = (sum+(x*x*x));
            temp = temp/10;
        }
        return sum == num;

    }
}
public class Assignment1Q1{
    public static void main(String[] args) {
        ArmstrongOrNot o=new ArmstrongOrNot();
        int num ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any three digit number: ");
        num = s.nextInt();

        boolean armstrong = o.armstrongCheck(num);

        if(armstrong){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an armstrong number");
        }


    }
}
