package Assignment1;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques5c {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i , j , k ;
        int n = s.nextInt();

        for(i=0 ; i<n ; i++)
        {
            j = 1 ;
            while( j<(n-i) )
            {
                System.out.print(" ");
                j++ ;
            }
            j = n - i ;
            k = 1;
            while(k<=(i+1))
            {
                System.out.print(j + " ");

                k++ ;
            }
            System.out.println(" ");

        }

    }
}
