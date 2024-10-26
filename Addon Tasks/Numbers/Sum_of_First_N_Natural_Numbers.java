package Numbers;

import java.util.Scanner;

public class Sum_of_First_N_Natural_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Sum of First N Natural Numbers");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= val1; i++) {
            sum+=i;
        }
        System.out.println("Sum of First N Natural Numbers is"+sum);

    }
}
