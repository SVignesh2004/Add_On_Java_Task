package Numbers;

import java.util.Scanner;

public class Number_of_Factors_of_a_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Factors of a Number");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int ans=0;
        for (int i=1;i<=val1;i++){
            if (val1%i==0){
                ans++;
            }
        }
        System.out.println(ans);

    }
}
