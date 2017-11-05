package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 22-06-2017.
 */
public class keypadPermutation {

    public static String character(int num )
    {
        String str[] = {" " , " " , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        return str[num];
    }

    public static String[] keypad(int num)
    {
        if (num == 0)
        {
            String[] result = {""};
            return result ;
        }
        String[] smallAns = keypad(num/10);
        String ch = character(num%10);
        String[] ans = new String[smallAns.length*ch.length()];
        int k=0 ;
        for (int i=0 ; i<ch.length() ; i++)
        {
            for (int j=0 ; j<smallAns.length ; j++)
            {
                ans[k] = smallAns[j] +ch.charAt(i) ;
                k++;
            }
        }
        return ans ;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] ans = keypad(n);
        for (String a:ans)
        {
            System.out.println(a);
        }


    }
}
