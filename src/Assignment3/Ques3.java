package Assignment3;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques3 {

    public static void reverseArray(int[] arr)
    {
        for(int i=0 ; i<arr.length/2 ; i++)
        {
            int temp = arr[i];
            arr[i] = arr[(arr.length - i -1)];
            arr[arr.length-i-1] = temp;
        }
        for( int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(" Enter number of elements in an array");
        int n = s.nextInt();
        int[] arr = new int[n];

        for( int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }

        reverseArray(arr);
    }


}
