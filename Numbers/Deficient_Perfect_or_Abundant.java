package Numbers;

import java.util.Scanner;

public class Deficient_Perfect_or_Abundant {
    public static void main(String[] args) {
        System.out.println("Enter the value to find number is  Deficient, Perfect, or Abundant ");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int sum=0;
        for (int i = 1; i <val1 ; i++) {
            if (val1%i==0){
                sum+=i;
            }
        }
        if (sum>val1){
            System.out.println("Abundant");
        } else if (sum==val1) {
            System.out.println("Perfect");
        }
        else{
            System.out.println("Deficient");
        }

    }
}
