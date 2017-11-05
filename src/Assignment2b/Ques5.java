package Assignment2b;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int i=1 , result=1;

        if( number == 0 || number == 1)
            System.out.println("Square root = " + number);
        else
        {
            while( result <= number)
            {
                result = i * i ;
                i++ ;
            }
            i = i - 2 ;
            System.out.println("Square root = " + i);
        }

    }
}
