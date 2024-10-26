package Numbers;

import java.util.Scanner;

public class Sum_of_Squares_of_Digits {
    public static void main(String[] args) {
        System.out.println("Enter the value to findSum of Squares of Digits");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int sum=0;
        while (val1>0){
            int a=val1%10;
            sum+=Math.pow(a,2);
            val1/=10;
        }
        System.out.println("Sum of Squares of Digits is "+sum);


    }
}
