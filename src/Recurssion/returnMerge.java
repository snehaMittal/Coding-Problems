package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 27-06-2017.
 */
public class returnMerge {

    public static int[] mergeSort(int[] a) {
        if (a.length > 1) {
            int i, mid = a.length / 2;
            int[] half1 = new int[mid];
            int[] half2 = new int[a.length - mid];
            for (i = 0; i < mid; i++)
                half1[i] = a[i];
            for (; i < a.length; i++)
                half2[i - mid] = a[i];
            half1 = mergeSort(half1);
            half2 = mergeSort(half2);

            int[] ans = new int[half1.length+half2.length];
            int j=0, k=0;
            for(i=0; j<half1.length&&k<half2.length; i++)
                if(half1[j]<half2[k])
                {
                    ans[i]=half1[j];
                    j++;
                }
                else
                {
                    ans[i]=half2[k];
                    k++;
                }
            for(; j<half1.length; i++, j++)
                ans[i]=half1[j];
            for(; k<half2.length; i++, k++)
                ans[i]=half2[k];

            return ans ;

        }
        return a ;
    }


    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        int[] arr = {4,9,0,8,7,6,1,3};
        int[] ans =mergeSort(arr);
        for (int i=0 ; i<ans.length ; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
