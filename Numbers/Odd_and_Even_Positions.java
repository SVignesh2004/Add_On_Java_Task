package Numbers;

import java.util.Scanner;

public class Odd_and_Even_Positions {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Odd and Even Positions");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int oddsum=0;
        int evensum=0;
        while (val1>0){
            int last=val1%10;
            if (last%2==0){
                evensum+=last;
            }
            else{
                oddsum+=last;
            }
            val1/=10;
        }
        System.out.println("Odd Position sum : "+oddsum+","+"Even position Sum : "+evensum);

    }
}
