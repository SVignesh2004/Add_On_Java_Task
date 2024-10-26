package Numbers;

import java.util.Scanner;

public class Number_is_a_Strong_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Number is a Strong Number");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2=val1;

        int ans=0;
        while (val1>0){
            int sum=1;
            int last=val1%10;
            for (int i = 1; i <=last ; i++) {
                sum*=i;
            }
            ans+=sum;

            val1/=10;
        }
        if (ans==val2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
