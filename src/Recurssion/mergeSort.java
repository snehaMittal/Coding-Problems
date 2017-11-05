package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 24-06-2017.
 */
public class mergeSort {
    public static void mergeSort(int[] a)
    {
        if(a.length>1)
        {
            int i,mid = a.length/2;
            int[] half1 = new int[mid];
            int[] half2 = new int[a.length-mid];
            for(i=0; i<mid; i++)
                half1[i]=a[i];
            for(; i<a.length; i++)
                half2[i-mid]=a[i];
            mergeSort(half1);
            mergeSort(half2);
            int j=0, k=0;
            for(i=0; j<half1.length&&k<half2.length; i++)
                if(half1[j]<half2[k])
                {
                    a[i]=half1[j];
                    j++;
                }
                else
                {
                    a[i]=half2[k];
                    k++;
                }
            for(; j<half1.length; i++, j++)
                a[i]=half1[j];
            for(; k<half2.length; i++, k++)
                a[i]=half2[k];
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        mergeSort(arr);
        for (int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
