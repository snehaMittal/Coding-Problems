package CustomHashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sneha on 13-08-2017.
 */
public class PairSumto0 {

    public static void PairSum(int[] arr, int size){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i=0 ; i<size ; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i] , 1);
            }
            else {
                map.put(arr[i] , map.get(arr[i])+1);
            }
        }
        for (Map.Entry<Integer , Integer> x : map.entrySet()){
            int req = 0 - x.getKey() ;
            if (map.containsKey(req)){
                int loop = x.getValue() * map.get(req);
                while (loop>0){
                    System.out.println(x.getKey() + " " + req);
                    loop-- ;
                }
                map.put(x.getKey() , -1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,-1,1,-2,4,5,6};
        PairSum(arr , 7);
    }
}
