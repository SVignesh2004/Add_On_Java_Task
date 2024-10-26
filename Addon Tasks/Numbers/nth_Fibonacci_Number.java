package Numbers;

import java.util.Scanner;

public class nth_Fibonacci_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to find  nth Fibonacci Number ");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        sc.close();
        System.out.println("nth Fibonacci Number : "+fibi(val1));

    }

    public static int fibi(int val1) {
        if (val1 == 0) {
            return 0;
        } else if (val1 == 1 ) {
            return 1;
        }
            return fibi(val1 - 1) + fibi(val1 - 2);
        }
}
