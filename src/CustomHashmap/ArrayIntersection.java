package CustomHashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sneha on 13-08-2017.
 */
public class ArrayIntersection {
    public static void helper(int[] arr1 , int[] arr2){
        HashMap<Integer , Integer > map = new HashMap<>();
        for (int i=0 ; i<arr1.length ; i++){
            if (!map.containsKey(arr1[i])){
                map.put(arr1[i] , 1000);
            }
            else {
                map.put(arr1[i] , map.get(arr1[i]) + 1000);
            }
        }
        for (int i=0 ; i<arr2.length ; i++){
            if (!map.containsKey(arr2[i])){
                continue;
            }
            else {
                if (map.get(arr2[i]) > 0){
                    System.out.println(arr2[i] + " ");
                    map.put(arr2[i],map.get(arr2[i])-1);
                }
            }
        }
    }
    public static void intersection(int[] arr1, int[] arr2){
       if (arr1.length < arr2.length)
           helper(arr1 , arr2);
       else
           helper(arr2,arr1);
    }
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,0,9,2,8,5};
        intersection(arr1 , arr2);
    }
}