package DataStructure;

import java.util.Scanner;

class ArmstrongNumBetweenRange {
    public int[] armstrongNumbersInRange (int min, int max){
        int i,j=0;
        int[] values=new int[max];
        for (i=min; i<=max; i++) {
            int temp = i, sum = 0;

            while (temp > 0) {
                int x = temp % 10;
                sum = (sum + (x * x * x));
                temp = temp / 10;
            }
            if (sum==i){
                values[j]=i;
                j++;
            }
        }

        return values;
    }
}
public class Assignment1Q2{
    public static void main(String[] args) {
        ArmstrongNumBetweenRange o=new ArmstrongNumBetweenRange();
        int min;
        int max;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any three digit number minimum value: ");
        min = s.nextInt();
        System.out.println("Enter any three digit number maximum value: ");
        max = s.nextInt();

        int[] armstrong = o.armstrongNumbersInRange(min,max);
        for(int i=0;armstrong[i]!='\0';i++){
            System.out.println(armstrong[i]+" is an armstrong number");

        }
    }
}