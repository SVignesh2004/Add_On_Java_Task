package Numbers;

import java.util.Scanner;

public class Power_of_Two {
    public static void main(String[] args) {
        System.out.println("Enter the value to find Power of Two");
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();

            if (checkpoweroftwo(val1)){
                System.out.println("ita a power of two");
            }
            else{
                System.out.println("not");
            }

        }
        public static boolean checkpoweroftwo(int val1){
        return val1>0 && (val1 & (val1-1))==0;
        }

    }

