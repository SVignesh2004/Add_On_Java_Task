package Numbers;

import java.util.Scanner;

public class Power_of_a_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Power of a Number");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2= sc.nextInt();
        System.out.println( Math.round(Math.pow(val1,val2)));


    }
}
