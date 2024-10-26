package Numbers;

import java.util.Scanner;

public class Digital_Root {
    public static void main(String[] args) {
        System.out.println("Enter the value to find   Digital Root");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        System.out.println(unitdigit(val1));



    }
    public  static  int unitdigit(int val1){
        int sum=0;
        while (val1>0){
            int last=val1%10;
            sum+=last;

            val1/=10;
        }

        return  sum>9? unitdigit(sum) : sum;
    }
}
