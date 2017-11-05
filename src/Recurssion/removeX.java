package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 21-06-2017.
 */
public class removeX {

    public static String removeX(String input)
    {
        int index = input.indexOf('x');
        if (index == -1)
        {
            return input ;
        }
        return removeX(input.substring(0 , index) + input.substring(index+1 , input.length()));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(removeX(str));
    }
}
