package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 22-06-2017.
 */
public class numberNames {

    public static String numName(int num)
    {
        if( num == 0)
        {
            return "" ;
        }
        if( num % 10 == 0)
            return numName(num/10) + "zero";
        if( num % 10 == 1)
            return numName(num/10) + "one";
        if( num % 10 == 2)
            return numName(num/10) + "two";
        if( num % 10 == 3)
            return numName(num/10) + "three";
        if( num % 10 == 4)
            return numName(num/10) + "four";
        if( num % 10 == 5)
            return numName(num/10) + "five";
        if( num % 10 == 6)
            return numName(num/10) + "six";
        if( num % 10 == 7)
            return numName(num/10) + "seven";
        if( num % 10 == 8)
            return numName(num/10) + "eight";
        if( num % 10 == 9)
            return numName(num/10) + "nine";

        return "" ;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(numName(n));
    }
}
