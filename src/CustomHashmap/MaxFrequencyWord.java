package CustomHashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sneha on 02-08-2017.
 */
public class MaxFrequencyWord {

    public static String maxFreqWord(String str){
        HashMap<String , Integer> map = new HashMap<>();
        String[] list = str.split(" ");

        for (int i=0 ; i<list.length ; i++){

            if (!map.containsKey(list[i])){
                map.put(list[i] , 1);
            }
            else {
                int count = map.get(list[i]);
                map.put(list[i],count+1);
            }
        }
        int max = Integer.MIN_VALUE;
        String required = "";
        for (Map.Entry<String , Integer> x : map.entrySet()){
            if (x.getValue().intValue() > max){
                required = x.getKey();
                max = x.getValue().intValue();
            }
        }
        return required ;
    }

    public static void main(String[] args) {
        String str = "Hello hey hi hello hey hey";
        System.out.println(maxFreqWord(str));
    }
}
