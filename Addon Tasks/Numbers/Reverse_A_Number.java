package Numbers;

import java.util.Scanner;

public class Reverse_A_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to reverse a number");
        Scanner sc = new Scanner(System.in);
        int val1=sc.nextInt();
        int val2=val1;
        int rev=0;
        while (val1>0){
            int a=val1%10;
            rev=rev*10+a;
            val1/=10;
        }
        System.out.println("Reversed number of "+val2+" is "+rev);
    }
}
