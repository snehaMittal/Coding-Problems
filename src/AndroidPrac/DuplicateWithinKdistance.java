package AndroidPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sneha on 19-08-2017.
 */
public class DuplicateWithinKdistance {

    public static boolean dupWithinKDist(int[] arr ,int k) {
        HashMap<Integer , help> map = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++){
            if (map.containsKey(arr[i])) {
                help h = map.get(arr[i]);
                h.numOfElements++;
                h.pos.add(i);
                map.put(arr[i], h);
            }
            else {
                help h = new help();
                h.numOfElements = 1;
                h.pos.add(i);
                map.put(arr[i], h);
            }
        }

        for (Map.Entry<Integer  , help> x : map.entrySet()){
            help h = x.getValue();
            if (h.numOfElements > 1){
                if((h.pos.get(1) - h.pos.get(0)) > k)
                    return false;
            }
        }

        return true ;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,6,7,9};
        System.out.println(dupWithinKDist(arr , 5));
    }
}
class help{
    int numOfElements;
    ArrayList<Integer> pos ;

    help(){
        pos = new ArrayList<>();
    }
}
