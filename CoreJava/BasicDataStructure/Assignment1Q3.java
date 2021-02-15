package DataStructure;

import java.util.Scanner;

public class Assignment1Q3 {
    public static void main(String[] args) {
        SiCi a = new SiCi();

        double principalAmount;
        int time;
        double interestRate;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Value of Principal Amount: ");
        principalAmount = s.nextDouble();
        System.out.println("Enter Time period : ");
        time = s.nextInt();
        System.out.println("Enter Rate of Interest: ");
        interestRate = s.nextDouble();

        double simpleInterest = a.simpleInterest(principalAmount, time, interestRate);
        System.out.println("Simple Interest: " + simpleInterest );

        double compoundInterest = a.compoundInterest(principalAmount, time, interestRate);
        System.out.println("Compound Interest: " + compoundInterest);

    }
}
class SiCi {
    public double simpleInterest(double principalAmount, int time, double interestRate){

        double Si;
        Si = (principalAmount*time*interestRate)/100;
        return Si;
    }
    public double compoundInterest(double principalAmount, int time,double interestRate){
        double Ci;
        Ci = (principalAmount * (Math.pow( (1 + interestRate/100),time)));
        return Ci;
    }
}
