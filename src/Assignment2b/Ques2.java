package Assignment2b;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i , value , j ;

        for(i=0 , j=0 ; i<20 ; j++ , i++)
        {
            value = (3 * j) + 2 ;
            if( value % 4 != 0)
            {
                System.out.print(value + " ");
            }
            else
                i-- ;
        }
    }
}
