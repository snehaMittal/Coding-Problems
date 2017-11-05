package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 21-06-2017.
 */
public class numOfZeroes {

    public static int countZerosRec(int input)
    {
        if ( input == 0)
        {
            return 0 ;
        }
        int ans = countZerosRec(input/10);

        if( input%10 == 0)
        {
            return 1+ans ;
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countZerosRec(n));
    }
}
