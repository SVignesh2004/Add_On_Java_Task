package Stringprb;

import java.util.Scanner;

public class Count_Vowels_Consonants {
    Scanner sc=new Scanner(System.in);
    String word;


public Count_Vowels_Consonants() {
    System.out.println("enter the word");
    word=sc.nextLine();
}
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};

   public void countVowelsAndConsonants() {
       char[] ch=word.toLowerCase().toCharArray();
       int v=0;
       int c=0;
       for (int i = 0; i < ch.length ; i++) {
           if (ch[i]>='a' && ch[i]<='z'){
               boolean isva=false;
               for (int j = 0; j < vowels.length; j++) {
                   if (vowels[j]==ch[i]){
                       isva=true;
                       break;
                   }

               }
               if (isva){
                   v++;

               }
               else{
                   c++;
               }
           }
       }

       System.out.println("vowels"+v);
       System.out.println("consontants"+c);
   }

}
