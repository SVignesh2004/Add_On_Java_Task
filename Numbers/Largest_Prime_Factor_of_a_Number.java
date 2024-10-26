package Numbers;

import java.util.Scanner;

public class Largest_Prime_Factor_of_a_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Largest Prime Factor of a Number");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int max=Integer.MIN_VALUE;
        for (int i = 1; i <val1 ; i++) {
            if (val1%i==0){
                if (prime(i)){
                    max=Math.max(max,i);
                }
            }
            
        }
        System.out.println(max);
            
        }
    public static  boolean prime(int val1){
        if (val1<=1){
            return false;
        }
        for (int i = 2; i <val1 ; i++) {
            if (val1%i==0){
                return false;
            }
        }
        return true;
    }

}
