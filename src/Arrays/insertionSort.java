package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 18-06-2017.
 */
public class insertionSort {

    public static void insertionSort( int[] arr)
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int x = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > x)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = x;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {9,8,7,4,5,6};

        insertionSort(arr);
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
