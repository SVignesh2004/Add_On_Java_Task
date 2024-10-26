package Numbers;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the value to find  Factorial ");
        Scanner sc = new Scanner(System.in);
        int val1=sc.nextInt();
        int sum=1;
        for (int i =val1 ; i >0 ; i--) {
            sum*=i;
        }
        System.out.println( "Factorial of " +val1+ " is "+sum);
    }
}
