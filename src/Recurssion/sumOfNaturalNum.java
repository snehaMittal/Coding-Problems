package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 21-06-2017.
 */
public class sumOfNaturalNum {

    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int small = sum(n-1);
        return small+n ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sum(n));
    }
}
