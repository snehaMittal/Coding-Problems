package ProgrammingFundamental2;

import java.util.Scanner;

/**
 * Created by Sneha on 16-06-2017.
 */
public class fibonaccii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c=0 , a=1 , b=1;
        if( n == 1)
            System.out.println(a);
        if( n == 2)
            System.out.println(b);
        for(int i=3 ; i<n ; i++)
        {
            c = a + b ;
            a = b ;
            b = c ;
        }
        if(n >= 3)
            System.out.println(c);
    }
}
