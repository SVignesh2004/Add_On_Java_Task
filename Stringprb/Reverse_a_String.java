package Stringprb;

import java.util.Scanner;

public class Reverse_a_String {
    public void reverseastring(){
        Scanner sc = new Scanner(System.in);
        String word= sc.nextLine();
        //inbuild method
//        StringBuilder sb = new StringBuilder(word);
//        System.out.println(sb.reverse());

        char[] ch = word.toCharArray();
        int l=0;
        int r= ch.length-1;
        while (l<r){
            char temp=ch[r];
            ch[r]=ch[l];
            ch[l]=temp;
            l++;
            r--;
        }
        for (char cr: ch){
            System.out.print(cr);
        }


    }

}
