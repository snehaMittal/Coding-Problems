package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 24-06-2017.
 */
public class stringToInt {

    public static int convertStringToInt(String input , int power)
    {
        if (input.length() == 0)
            return 0;
        int p = (int)(Math.pow(10 , power));
        int i = (int)(input.charAt(0))-48;
        int sum = ((i)*p) + convertStringToInt(input.substring(1) , power-1);
        return sum ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(convertStringToInt(str,str.length()-1));

    }
}
