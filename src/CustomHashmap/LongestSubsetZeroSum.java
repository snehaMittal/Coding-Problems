package CustomHashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Sneha on 07-08-2017.
 */
public class LongestSubsetZeroSum {
    public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0 , i=0 ;
        for (Integer x : arr){
            sum = sum + x ;
            if (x == 0 && len == 0)
                len = 1 ;
            if (sum == 0)
                len = len + i ;
            Integer i_pre = map.get(sum);
            if (i_pre != null)
                len = Math.max(len , i-i_pre);
            else
                map.put(sum , i);
            i++ ;
        }
        return len ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0 ; i<8 ; i++){
            int a = s.nextInt();
            arr.add(a);
        }
        System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
    }
}
