package Assignment2a;

import java.util.Scanner;

/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques8d {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i , j , k ;

        for( i=0 ; i<n ; i++)
        {
            j = 0 ;
            k = 1 ;
            while(j<(n-i))
            {
                System.out.print(k);
                j++ ;
                k++ ;
            }
            System.out.println(" ");
        }
    }
}
