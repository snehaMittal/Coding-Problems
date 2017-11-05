package Assignment1;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques2 {

    public static int gcd( int num1 , int num2)
    {
        int i , c=1 ;

        for( i=1 ; i<=num1 && i<=num2 ; i++)
        {
            if( num1%i == 0 && num2%i == 0)
            {
                c = i ;
            }
        }
        return i ;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();


        System.out.println( gcd ( num1 , num2));


    }
}
