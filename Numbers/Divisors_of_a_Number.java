package Numbers;

import java.util.Scanner;

public class Divisors_of_a_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Divisors of a Number");
        Scanner sc = new Scanner(System.in);
        int val1=sc.nextInt();
        for (int i = 1; i <=val1; i++) {
            if (val1%i==0){
                System.out.print(i+" ");
            }
            
        }
        
    }
}
