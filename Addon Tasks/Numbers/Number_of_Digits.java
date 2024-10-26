package Numbers;

import java.util.Scanner;

public class Number_of_Digits {
    public static void main(String[] args) {
        System.out.println("Enter the value to find  Number of Digits");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int c=0;
        while (val1>0){
            val1=val1/10;
            c++;

        }
        System.out.println(" Number of Digits is : " + c);
    }
}
