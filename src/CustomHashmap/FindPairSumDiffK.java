package CustomHashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sneha on 02-08-2017.
 */
public class FindPairSumDiffK {

    public static void findPairsDifferenceK(int[] arr, int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i] , 1);
            }
            else {
                map.put(arr[i] , map.get(arr[i])+1);
            }
        }
        if (k == 0){
            for (Map.Entry<Integer , Integer> x : map.entrySet()){
                int loop=0 ;
                for (int i=1 ; i<x.getValue() ; i++){
                    loop = loop + i ;
                }
                while (loop>0){
                    System.out.println(x.getKey() + " " + x.getKey());
                    loop-- ;
                }
            }
        }
        else{
            for (Map.Entry<Integer , Integer> x : map.entrySet()){
                int req = x.getKey()+k ;
                if (map.containsKey(req)){
                    int loop = x.getValue() * map.get(req);
//                    System.out.println(loop);
                    while (loop>0){
                        System.out.println(x.getKey() + " " + req);
                        loop-- ;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2};
        findPairsDifferenceK(arr , 0);
    }
}
