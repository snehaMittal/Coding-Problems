package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 21-06-2017.
 */
public class replacePi {

    public static String replace(String input)
    {

        int index = input.indexOf("pi");
        if (index == -1)
        {
            return input ;
        }
        return replace(input.substring(0 , index) + 3.14 + input.substring(index+2 , input.length()));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(replace(str));
    }
}
