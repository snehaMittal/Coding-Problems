package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 07-07-2017.
 */
public class printSubsetSumToK {

    public static void printSubsetsSumTok(int input[] , int k)
    {
        int[] arr = new int[0];
        subset(input , arr ,0 , k);
    }

    public static void subset(int[] input , int[] arr , int index , int k )
    {
        if (index == input.length)
        {
            int sum=0 ;
            for (int i=0 ; i<arr.length ; i++)
            {
                sum = sum + arr[i];
            }
            if (sum == k)
            {
                for (int i=0 ; i<arr.length ; i++)
                {
                    System.out.print(arr[i]+ " ");
                }
                System.out.println(" ");
            }
            return;
        }

        int[] temp = new int[input.length+1];
        subset(input , arr , index+1 , k);
        subset(input , newArray(input,index ,arr) , index+1 , k);

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
        printSubsetsSumTok(arr , 3);

    }
}
