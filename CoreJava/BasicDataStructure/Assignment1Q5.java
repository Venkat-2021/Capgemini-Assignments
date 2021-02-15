package DataStructure;

import java.util.Scanner;

public class Assignment1Q5 {
    public static void main(String[] args) {
        TaxAmount obj = new TaxAmount();
        int CTC;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter CTC Amount: ");
        CTC = s.nextInt();
        String A = "Nil";

        double calculateTaxAmount = obj.calculateTaxAmount(CTC);

        if (CTC <= 180_000){
            System.out.println("Income Tax Amount is: "+ A);
        }
        else
            System.out.println("Income Tax Amount is: "+ calculateTaxAmount);

    }
}
class TaxAmount{
    public double calculateTaxAmount(int CTC){
        double a = 10, b = 20, c = 30;

        if (CTC > 180_001 && CTC <= 300_000){
            double slabB;
            slabB = CTC*a/100;
            return slabB;
        }
        else if (CTC > 300_001 && CTC <= 500_000){
            double slabC;
            slabC = CTC*b/100;
            return slabC;
        }
        else if (CTC > 500_001 && CTC <= 100_000_0){
            double slabD;
            slabD = CTC*c/100;
            return slabD;

        }

        return CTC;
    }
}