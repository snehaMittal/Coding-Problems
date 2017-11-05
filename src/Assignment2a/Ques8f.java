package Assignment2a;

import java.util.Scanner;

/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques8f {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i , j , k ;

        for(i=0 ; i<n ; i++)
        {
            j = 1 ;
            while(j<=(n-i))
            {
                if( i%2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");

                j++ ;
            }
            System.out.println(" ");

        }
    }
}
