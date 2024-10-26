package Codeing_Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class odd_pos_dec_even_pos_asc {
    public static void main(String[] args) {
        int a[]=  {13,2, 4,15,12,10,5};
        List<Integer> oddlist= new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i <a.length ; i++) {
            if (i%2==0){
                oddlist.add(a[i]);

            }
            else {
                evenList.add(a[i]);
            }
        }
        Collections.sort(oddlist,Collections.reverseOrder());
        Collections.sort(evenList);
        int oddindex=0;
        int evenidex=0;
        for (int i=0;i< a.length;i++){
            if (i%2==0){
                a[i]=oddlist.get(oddindex++);
            }
            else {
                a[i]=evenList.get(evenidex++);
            }
        }
        for (int j:a){
            System.out.print(j+" ");
        }
    }
}
