package Numbers;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to Find Armstrong Number");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2=val1;
        int c=0;
        int sum=0;
        while(val1>0){
            val1/=10;
            c++;
        }
        val1=val2;
        while (val1>0){
            int a =val1%10;
            sum+=Math.pow(a,c);
            val1/=10;
        }
        if (sum==val2){
            System.out.println("True it is a Armstrong Number");
        }
        else{
            System.out.println("False it is not a Armstrong Number");
        }
    }
}
