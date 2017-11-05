package Assignment2b;

import java.util.Scanner;

/**
 * Created by Sneha on 13-06-2017.
 */
public class Ques6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = s.nextInt();
        int a , b , c ;
        boolean d = true ;

        c = num ;
        a = s.nextInt();
        while (c-- > 1)
        {
            b = s.nextInt();
            if( a < b)
            {
                a = b ;
                break ;
            }
            a = b ;
        }
        while ( c-- > 1)
        {
            b  =s.nextInt();
            if (a > b)
            {
                d = false ;
                break ;
            }
        }
        if ( d == true)
            System.out.println("YES");
        else
            System.out.println("NO");



    }
}
