package Numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Prime number");
        Scanner sc = new Scanner(System.in);
        int val1=sc.nextInt();
        if (val1>1){
            for (int i = 2; i <Math.sqrt(val1); i++) {
                if (val1%i==0){
                    System.out.println("It is not a prime number");
                    break;
                }
                else{
                    System.out.println("It is a prime number");
                    break;
                }

            }
        }
    }
}
