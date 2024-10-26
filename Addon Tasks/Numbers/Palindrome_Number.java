package Numbers;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Palindrome Number");
        Scanner sc = new Scanner(System.in);
        int val1=sc.nextInt();
        int val2= val1;
        int sum=0;
        while(val1>0){
            int a=val1%10;
            sum=sum*10+a;
            val1/=10;
        }

        if (sum==val2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
