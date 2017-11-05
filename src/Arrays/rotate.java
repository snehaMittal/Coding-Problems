package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 17-06-2017.
 */
public class rotate {

    public static void rotate(int[] arr, int d)
    {
        int[] temp = new int[arr.length];
        int k=0 ;
        for(int i=d ; i<arr.length ; i++)
        {
            temp[k] = arr[i];
            k++;
        }
        for(int i=0 ; i<d ; i++)
        {
            temp[k] = arr[i];
            k++;
        }
        for(int i=0 ; i<arr.length ; i++)
        {
            arr[i] = temp[i];
        }


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        int num = s.nextInt();
        rotate(arr , num);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
