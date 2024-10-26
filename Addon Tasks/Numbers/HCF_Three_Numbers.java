package Numbers;

import java.util.Scanner;

public class HCF_Three_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter the value to find  HCF of Three Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("val1");
        int val1 = sc.nextInt();
        System.out.println("val2");
        int val2= sc.nextInt();
        System.out.println("val3");
        int val3=sc.nextInt();
        System.out.println("HCF of : "+ hcf(val1,hcf(val2,val3)));
    }

    public static  int hcf(int val1,int val2){
        if (val2==0){
            return val1;
        }
        return hcf(val2,val1%val2);
    }
}
