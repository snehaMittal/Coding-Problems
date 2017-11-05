package CustomHashmap;

import java.util.HashMap;

/**
 * Created by Sneha on 02-08-2017.
 */
public class ExtractUniqueCharacter {

    public static String uniqueChar(String str){
        String temp = "";
        HashMap<Character , Integer> map = new HashMap<>();
        int i =0 ;
        while ( i < str.length()){
            char ch = str.charAt(i);
            if (!map.containsKey(ch)){
                map.put(ch , 1);
                temp = temp + ch ;
            }
            i++ ;
        }
        return temp ;
    }
    public static void main(String[] args) {
        System.out.println(uniqueChar("ababcdabcdcd"));
    }
}
