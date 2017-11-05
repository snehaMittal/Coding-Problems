package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 23-06-2017.
 */
public class printKeypad {

    public static String character(int num )
    {
        String str[] = {" " , " " , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        return str[num];
    }

    public static void keypad(int num , String s)
    {
        if (num == 0)
        {
            System.out.println(s);
            return ;
        }
        String ch = character(num%10);
        for (int i=0 ; i<ch.length() ; i++)
        {
            keypad(num/10 , ch.charAt(i)+s) ;
        }

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        keypad(n , "");
        
    }
}
