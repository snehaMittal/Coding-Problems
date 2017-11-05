package Assignment1;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques5e {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i , j , k ;
        int n = s.nextInt();

        for( i=0 ; i<n ; i++)
        {
            for(j=0 ; j<(n-i) ; j++)
            {
                System.out.print("*");
            }
            for(j=0 ; j<i ; j++)
            {
                System.out.print(" ");
            }
            for(j=0 ; j<i ; j++)
            {
                System.out.print(" ");
            }
            for(j=0 ; j<(n-i) ; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for( i=0 ; i<(n-1) ; i++)
        {
            for( j=0 ; j<(i+2) ; j++)
            {
                System.out.print("*");
            }
            for( j=2 ; j<(n-i) ; j++)
            {
                System.out.print(" ");
            }
            for( j=0 ; j<(n-i-2) ; j++)
            {
                System.out.print(" ");
            }
            for( j=0 ; j<(i+2) ; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
