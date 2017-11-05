package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 22-06-2017.
 */
public class pairStar {

    public static String addStars(String s)
    {
        if (s.length() == 1)
        {
            return s ;
        }
        if (s.charAt(0) == s.charAt(1))
            return s.substring(0,1) + "*" +  addStars(s.substring(1 , s.length()));

        return s.substring(0,1) + addStars(s.substring(1 , s.length() )) ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(addStars(str));

    }
}
