package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 24-06-2017.
 */
public class checkAB {

    public static boolean checkAB(String input)
    {
        if (input.charAt(0) != 'a')
        {
            return false ;
        }
        return check(input.substring(1));
    }

    public static boolean check(String input)
    {
        if (input.substring(0,1).compareTo("a") == 0 && input.substring(1).compareTo("") == 0)
        {
            return true ;
        }
        else if ((input.substring(0,1).compareTo("a") == 0 && input.substring(1,2).compareTo("a") == 0) || (input.substring(0,1).compareTo("a") == 0 && input.substring(1,3).compareTo("bb") == 0) )
        {
            return check(input.substring(1));
        }
        else if (input.substring(0,2).compareTo("bb") == 0 && input.substring(2).compareTo("") == 0)
        {
            return true ;
        }
        else if (input.substring(0,2).compareTo("bb") == 0 && input.substring(2,3).compareTo("a") == 0)
        {
            System.out.println(input.substring(2,3));
            return check(input.substring(2));
        }

        return false ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(checkAB(str));
    }
}
