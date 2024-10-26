package Numbers;

import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Greatest Common Divisor ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value1");
        int val1 = sc.nextInt();
        System.out.println("Enter the value2");
        int val2= sc.nextInt();
        gdc(val1,val2);
    }
    public static  void gdc(int a ,int b){

        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("Greatest Common Divisor is "+a);
    }

}
