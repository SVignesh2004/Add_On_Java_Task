package Numbers;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("Enter the value to find  LCM of a Number");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2=sc.nextInt();
        int ans=(val1>val2) ? val1 : val2;
        while (true){
            if (ans%val1==0 && ans%val2==0){
                break;
            }
            else
              ans++;
        }
        System.out.println("LCM of "+ val1+ " and "+ val2 + " is : "+ ans);

    }
}
