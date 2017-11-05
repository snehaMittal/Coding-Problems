package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 25-06-2017.
 */
public class arraySubsequence {
    public static int[] subSequence(int[] s , int index)
    {
        if (s.length == index)
        {
            int[] result = new int[1];
            return s;
        }
        int[] smallAns = subSequence(s , index + 1);
        int[] ans = new int[2*smallAns.length];
        int k=0 ;
        for (int i=0 ; i<smallAns.length ; i++)
        {
            ans[k] = smallAns[i];
            k++;
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        int[] ans = subSequence(arr , 0);
        for (int i=0 ; i<ans.length ; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }

}
