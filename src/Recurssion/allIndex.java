package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 21-06-2017.
 */
public class allIndex {

    public static int[] allIndexes(int input[], int x , int index)
    {
        if (input.length == index)
        {
            int[] arr = {};
            return arr ;
        }
        int[] smallAns = allIndexes(input , x , index+1);
        if (input[index] == x)
        {
            int[] temp = new int[smallAns.length+1];
            temp[0] = index ;
            for (int i=1 ; i<temp.length ; i++)
            {
                temp[i] = smallAns[i-1];
            }
            return temp ;
        }
        return  smallAns;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        int[] ans = allIndexes(arr , x , 0);
        for (int i=0 ; i<ans.length ; i++)
        {
                System.out.print(ans[i] + " ");
        }
    }
}
