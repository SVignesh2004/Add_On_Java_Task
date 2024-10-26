package Codeing_Problems;

import java.util.Scanner;

public class odd_numbers_in_the_range {
    public static void main(String[] args) {
        System.out.println("Enter value to find odd numbers in between the range.");
        Scanner sc= new Scanner(System.in);
        System.out.println("From");
        int from=sc.nextInt();
        System.out.println("To");
        int to = sc.nextInt();
        for (int i=from;i<to;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
