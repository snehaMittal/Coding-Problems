package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 22-06-2017.
 */
public class subSeqOfString {

    public static String[] subSequence(String s)
    {
        if (s.length() == 0)
        {
            String[] result = {""};
            return result;
        }
        String[] smallAns = subSequence(s.substring(1));
        String[] ans = new String[2*smallAns.length];
        int k=0 ;
        for (int i=0 ; i<smallAns.length ; i++)
        {
            ans[k] = s.charAt(0) + smallAns[i];
            k++ ;
            ans[k] = smallAns[i];
            k++;
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] ans = subSequence(str);
        for (String a:ans)
        {
            System.out.println(a);
        }
    }
}
