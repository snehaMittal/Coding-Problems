package Assignment2a;

import java.util.Scanner;

/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques8b {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i , j , k ;

        System.out.println("1");
        for( i=2 ; i<=n ; i++)
        {
            for( j=1 ;j<=i ; j++)
            {
                if ( j == 1 || j == (i))
                {
                    System.out.print(i-1);
                }
                else
                    System.out.print("0");
            }
            System.out.println(" ");
        }
    }
}
