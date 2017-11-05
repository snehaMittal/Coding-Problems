package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 21-06-2017.
 */
public class sumOfArray {

    public static int sum(int input[])
    {
       return sum( input , (input.length-1));
    }

    public static int sum(int input[] , int index)
    {
        if(index == 0)
        {
            return input[0];
        }
        int small = sum(input , index-1);
        return small + input[index] ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n] ;
        for (int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println(sum(arr));
    }
}
