package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 24-06-2017.
 */
public class printPermutation {

    public static void permutation(String input ,String result)
    {
        if (input.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i=0 ; i<input.length() ; i++)
        {
            permutation(input.substring(0 , i) + input.substring(i+1) , result+input.charAt(i));
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        permutation(str , "");
    }
}
