package Numbers;

import java.util.Scanner;

public class Prime_Numbers_in_a_Range {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Prime Numbers in a Range");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int sum=0;
        for (int i = val1; i <=val2 ; i++) {
       if (primenumber(i)){
           sum+=i;
       }
        }
        System.out.println("sum:" + sum);
    }

    public static  boolean primenumber(int val1){
        if (val1 <=1) {
            return false;
        }
        for (int i = 2; i <Math.sqrt(val1) ; i++) {
            if (val1%i==0){
                return  false;
            }

        }
        return  true;
    }
}
