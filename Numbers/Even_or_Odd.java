package Numbers;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Even or Odd");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        if (val1%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}
