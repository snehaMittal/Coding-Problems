package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 26-06-2017.
 */
public class printSubarray {

    public static void printSubsets(int input[])
    {
        int[] arr = new int[0];
        subset(input , arr ,0);
    }

    public static void subset(int[] input , int[] arr , int index )
    {
        if (index == input.length)
        {
            for (int i=0 ; i<arr.length ; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println(" ");
            return;
        }

        int[] temp = new int[input.length+1];
        subset(input , arr , index+1);
        subset(input , newArray(input,index ,arr) , index+1);

    }

    public static int[] newArray(int input[] , int index , int[] arr )
    {
        int[] newArrayy = new int[arr.length+1];
        for (int i=0 ; i<arr.length ; i++)
        {
            newArrayy[i] = arr[i];
        }
        newArrayy[newArrayy.length-1] = input[index];
        return newArrayy;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {1, 2, 3};
        printSubsets(arr);

    }
}
