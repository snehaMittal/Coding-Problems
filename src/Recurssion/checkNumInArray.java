package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 21-06-2017.
 */
public class checkNumInArray {

    public static boolean checkNumber(int input[], int x)
    {
        return checkNumber( input , x , input.length-1);
    }

    public static boolean checkNumber(int input[], int x ,int index)
    {
        if (index == 0 && input[0] != x)
        {
            return false ;
        }
        if (input[index] == x)
        {
            return true ;
        }

        return checkNumber(input , x , index-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n] ;
        for (int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(checkNumber(arr , x));

    }
}
