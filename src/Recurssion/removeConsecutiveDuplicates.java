package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 22-06-2017.
 */
public class removeConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String s)
    {
        if (s.length() == 1)
        {
            return s.substring(0);
        }
        if (s.charAt(0) == s.charAt(1))
        {
            return removeConsecutiveDuplicates(s.substring(0,1)+s.substring(2));
        }
        return s.substring(0,1) + removeConsecutiveDuplicates(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
