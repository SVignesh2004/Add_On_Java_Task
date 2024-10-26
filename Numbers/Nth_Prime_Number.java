package Numbers;

import java.util.Scanner;

public class Nth_Prime_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Divisors of a Number");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int c=0;
        int num=1;
        while (c<val1) {
            num++;
            if (primenumber(num)){
                c++;
            }
        }
        System.out.println(num);

    }
    public static  boolean primenumber(int val1){
        if (val1<=1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(val1) ; i++) {
            if (val1%i==0){
                return false;
            }

        }
        return  true;
    }
}
