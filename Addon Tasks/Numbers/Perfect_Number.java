package Numbers;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to find  Perfect Number");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int sum=0;
        for (int i = 1; i <val1 ; i++) {
            if (val1%i==0) {
                sum += i;
            }
        }
        if (sum==val1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
