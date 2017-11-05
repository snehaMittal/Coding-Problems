package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 20-06-2017.
 */
public class isSorted {

    public static boolean isSorted(int[] input)
    {
        if( input.length == 1)
        {
            return true ;
        }
        if(input[0] > input[1])
        {
                return false;

        }
        int[] smallArray = new int[input.length-1];
        for (int i=0 ; i<smallArray.length ; i++)
        {
            smallArray[i] = input[i+1];
        }
        return isSorted(smallArray) ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i=0 ; i<n ; i++)
        {
            input[i] = s.nextInt();
        }
        System.out.println(isSorted(input));
    }
}
