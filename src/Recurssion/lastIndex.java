package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 20-06-2017.
 */
public class lastIndex {

    public static int lastIndex(int input[], int x)
    {
        return lastIndex(input , x , 0);
    }

    public static int lastIndex(int[] input , int x , int index)
    {
        return 0;
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
        System.out.println(lastIndex(input,x));

    }
}
