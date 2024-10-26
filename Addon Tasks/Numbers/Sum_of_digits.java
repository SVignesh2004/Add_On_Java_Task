package Numbers;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Value To Find Sum_Of_Digits");
        int val=sc.nextInt();
        int val2=val;
        int sum=0;
        while(val>0){
            int a=val%10;
            sum+=a;
            val/=10;
        }
        System.out.println("Sum of Digit of "+val2+"is "+sum);
    }
}
