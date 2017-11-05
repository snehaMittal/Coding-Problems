package CustomHashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Sneha on 04-08-2017.
 */
public class MaxFrequencyNumber {

    public static int maxFrequencyNumber(int[] arr){

        LinkedHashMap<Integer ,Integer> map = new LinkedHashMap<>();
        for (int i=0 ; i<arr.length ; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = -1 ;
        for (Map.Entry<Integer,Integer> x : map.entrySet()){
            if (x.getValue()> max){
                max = x.getValue();
                ans = x.getKey();
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,2,1};
        System.out.println(maxFrequencyNumber(arr));
    }
}
