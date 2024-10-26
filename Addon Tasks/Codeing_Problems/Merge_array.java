package Codeing_Problems;

import java.util.HashSet;

public class Merge_array {
    public static void main(String[] args) {
        int arr1[]= {2,4,5,6,7,9,10,13};
        int arr2[]={2,3,4,5,6,7,8,9,11,15};
        HashSet<Integer> ans= new HashSet<>();
        for (int i:arr1) {
            ans.add(i);
        }
        for (int j:arr2){
            ans.add(j);
        }
        System.out.println(ans);
    }
}
