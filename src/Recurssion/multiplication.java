package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 21-06-2017.
 */
public class multiplication {


    public static int multiplyTwoIntegers(int m, int n)
    {
        if(n == 0)
        {
            return  0;
        }
        if( n == 1)
        {
            return m ;
        }
        int smallAns = multiplyTwoIntegers(m , n-1);
        return m + smallAns ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        System.out.println(multiplyTwoIntegers(m , n));
    }
}
