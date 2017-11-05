package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 22-06-2017.
 */
public class allPermutationOfString {

    public static String[] allPermutation(String str)
    {
        if (str.length() == 0)
        {
            String[] result = {""};
            return result;
        }
        String[] smallAns = allPermutation(str.substring(1));
        String[] ans = new String[str.length()*smallAns.length];
        int k =0 ;
        for (int i=0 ; i<smallAns.length; i++)
        {
            for (int j=0 ; j<=smallAns[0].length() ; j++)
            {
                ans[k] = smallAns[i].substring(0,j) + str.charAt(0) + smallAns[i].substring(j);
                k++ ;
            }
        }
        return ans ;

    }

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
        String[] ans = allPermutation("25");
        for (String a:ans)
        {
            System.out.println(a);
        }

    }
}
