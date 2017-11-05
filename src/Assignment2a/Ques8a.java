package Assignment2a;

import java.util.Scanner;

/**
 * Created by Sneha on 11-06-2017.
 */
public class Ques8a {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i , j , k ;

        for( i=0 ; i<n ; i++)
        {
            j=0;
            while(j<=i)
            {
                System.out.print("1");
                j++;
            }
            System.out.println(" ");
        }
    }
}
