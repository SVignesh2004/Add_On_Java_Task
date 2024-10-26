package Numbers;

import java.util.Scanner;

public class Trailing_Zeros_in_Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Trailing Zeros in Factorial");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int zeros=countzero(val1);
        System.out.println(zeros);
    }
    public static int countzero(int val1){

        int c=0;
        for (int i = 5; val1/i >= 1; i*=5) {
            c+=val1/i;
        }
        return c;
    }
}
