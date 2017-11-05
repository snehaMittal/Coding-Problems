package ProgrammingFundamental2;

import java.util.Scanner;

/**
 * Created by Sneha on 16-06-2017.
 */
public class numberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for( int i=0 ; i<n ; i++)
        {
            int k=n-i;
            for(int j=0 ; j<n ; j++)
            {
                if (k < n)
                {
                    k++;
                }
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }
}
