package Stringprb;

import java.util.Scanner;

public class Uppercase_and_Lowercase {
    public void changecase(){
        Scanner sc = new Scanner(System.in);
        String word= sc.nextLine();
        String hi=word.toUpperCase();
        String lo=word.toLowerCase();
        System.out.println("uppercase "+hi);
        System.out.println("lowercase "+lo);
    }
}
