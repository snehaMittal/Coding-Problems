package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 20-06-2017.
 */
public class firstIndex {


    public static int firstIndex(int input[], int x)
    {
        if(input.length == 0)
        {
            return -1 ;
        }

        if( input[0] == x)
            return 0;

        int[] smallArray = new int[input.length-1];
        for (int i=0 ; i<smallArray.length ; i++)
        {
            smallArray[i] = input[i+1];
        }

        int ans = firstIndex(smallArray , x);
        if(ans == -1)
        {
            return -1;
        }
        else
        {
            return ans+1 ;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i=0 ; i<n ; i++)
        {
            input[i] = s.nextInt();
        }
        int x = s.nextInt();
        int ans = firstIndex(input , x);
        System.out.println(ans);
    }
}
