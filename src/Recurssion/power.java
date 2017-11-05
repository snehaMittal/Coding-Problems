package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 20-06-2017.
 */
public class power {

    public static int power(int x , int n)
    {
        if (n == 0)
        {
            return 1;
        }
        int smallAns = power( x , (n-1));
        return smallAns*x ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(power(x,n));
    }
}
