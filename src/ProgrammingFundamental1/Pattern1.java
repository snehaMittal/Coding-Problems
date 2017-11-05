package ProgrammingFundamental1;

import java.util.Scanner;

/**
 * Created by Sneha on 16-06-2017.
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=0 ; i<n ; i++)
        {
            int k = i+1 ;
            for(int j=0 ; j<(i+1) ; j++)
            {
                System.out.print(k );
                k++;
            }
            System.out.println(" ");
        }
    }
}
