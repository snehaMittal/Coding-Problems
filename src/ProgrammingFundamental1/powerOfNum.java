package ProgrammingFundamental1;

import java.util.Scanner;

/**
 * Created by Sneha on 15-06-2017.
 */
public class powerOfNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        long product=1 ;
        for(int i=0 ; i<x ; i++)
        {
            product = product * n ;
        }
        System.out.println(product);
    }
}
