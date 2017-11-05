package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 23-06-2017.
 */
public class binarySearch {

    public static int binarySearch(int input[], int element)
    {
        return binarySearch(input , 0 , input.length-1 , element);
    }

    public static int binarySearch(int[] input , int n , int l , int element)
    {
        if (l < n)
            return -1 ;
        int mid = n + (l-n)/2;
        if (input[mid] == element)
            return mid;
        if (element < input[mid])
            return binarySearch(input , n , mid-1 , element);

        return binarySearch(input , mid+1 , l , element);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(binarySearch(arr , x) );
    }
}
