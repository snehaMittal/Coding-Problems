package CustomHashmap;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Sneha on 07-08-2017.
 */
public class LongestConsecutiveSubseq {

    public static ArrayList<Integer> longestSubsequence(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int final_size=Integer.MIN_VALUE , size=0 , num=arr[0] , final_num = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++){
            map.put(arr[i] , 1);
        }
        for (int i=0 ; i<arr.length ; i++){
            if (!map.containsKey(arr[i] - 1)) {
                size = 0 ;
                int j = arr[i];
                while (map.containsKey(j)){
                    num = j ;
                    size++ ;
                    j++ ;
                }
                if (size > final_size){
                    final_num = num;
                    final_size = size ;
                }
            }
        }
        for (int i=0 ; i< final_size ; i++){
            ans.add(final_num-i);;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,9,8,7,0,5,6,12,23,34};
        ArrayList<Integer> ans = longestSubsequence(arr);
        for (Integer x:ans){
            System.out.println(x+" ");
        }
    }
}
