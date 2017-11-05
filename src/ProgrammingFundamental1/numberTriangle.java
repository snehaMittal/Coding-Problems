package ProgrammingFundamental1;

import java.util.Scanner;

/**
 * Created by Sneha on 16-06-2017.
 */
public class numberTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for( int i=0 ; i<n ; i++)
        {
            for( int j=0 ; j<(n-i-1) ; j++)
            {
                System.out.print(" ");
            }
            int k = i+1;
            for(int j=0 ; j<(i+1) ; j++)
            {
                System.out.print(k);
                k++;
            }
            k=k-2;
            for(int j=0 ; j<i ; j++)
            {
                System.out.print(k);
                k--;
            }
            System.out.println(" ");
        }
    }
}
