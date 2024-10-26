package Numbers;

import java.util.Scanner;

public class sqrt_root {
    public static void main(String[] args) {
        System.out.println("Enter the value to sqrt with inbuild function");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();

        if (val1<2){
            System.out.println(val1);
        }
        int l=1;
        int h=val1;
        int ans=0;
        while (l<=h){
            int mid=(l+h)/2;
            if (mid*mid==val1){
                h=mid;
                break;
            } else if (mid*mid<val1) {
                l=mid+1;

            }
            else {
                h=mid-1;
            }
        }
        System.out.println(h);



    }

}
