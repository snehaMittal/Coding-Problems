package Assignment3;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques5 {

    public static void pairOfElements( int[] arr , int x)
    {
        for( int i=0 ; i<arr.length ; i++)
        {
            for( int j=i+1 ; j<arr.length ; j++)
            {
                if(( arr[i] + arr[j] == x))
                {
                    if (arr[i] < arr[j])
                    {
                        System.out.println(arr[i] + " " + arr[j]);
                    }
                    else
                    {
                        System.out.println(arr[j] + " " + arr[i]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for( int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();


        pairOfElements( arr , x);
    }
}
