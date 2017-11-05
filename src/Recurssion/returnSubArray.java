package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 06-07-2017.
 */
public class returnSubArray {

    public static int[][] subsets(int input[])
    {
        int[][] ans = subarray(input , 0);
        return ans;
    }

    public static int[][] subarray(int[] input , int index)
    {
        if (index == input.length)
        {
            int[][] result = {{}} ;
            return result;
        }
        int[][] smallans = subarray(input , index+1);
        int[][] ans = new int[2*smallans.length][];
        int i , k , l;
        for ( i=0 ; i<smallans.length ; i++)
        {
            ans[i] = new int[smallans[i].length];
            k=0 ;
            for (int j=0 ; j<smallans[i].length ; j++)
            {
                ans[i][k] = smallans[i][j];
                k++ ;
            }
        }
        for ( ;i<ans.length ; i++)
        {
            ans[i] = new int[smallans[i-smallans.length].length+1];
            k=0 ;
            ans[i][k] = input[index];
            k++ ;
            for (int j=0 ; j<smallans[i-smallans.length].length ; j++)
            {
                ans[i][k] = smallans[i-smallans.length][j];
                k++ ;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,2,3};
        int[][] ans = subsets(arr);
        for (int i=0 ; i<ans.length ; i++)
        {
            for (int j=0 ; j<ans[i].length ; j++)
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
