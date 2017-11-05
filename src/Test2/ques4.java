package Test2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sneha on 10-07-2017.
 */
public class ques4 {

    public static boolean splitArray(int input[])
    {
        Arrays.sort(input);
        int a1[] = new int[input.length];
        int a2[] = new int[input.length];
        int a3[] = new int[input.length];
        int sum=0 ,a=0,b=0,c=0,d ,s1=0,s2=0,s3=0 , req;
        for (int i=0 ; i<input.length ; i++)
        {
            sum = sum + input[i];
        }
        if (sum % 2 == 1 ||  input.length == 1)
        {
            return false;
        }
        else
        {
            req = sum/2 ;
            for (int i=0 ; i<input.length ; i++)
            {
                if (input[i] % 5 == 0)
                {
                    a1[a] = input[i];
                    a++;
                    s1 = s1+input[i];
                }
                if (input[i] % 3 == 0)
                {
                    a2[b] = input[i];
                    b++;
                    s2 = s2 + input[i];
                }
                else
                {
                    a3[c] = input[i];
                    c++;
                    s3 = s3 + input[i];
                }
            }
            if ((s1==s2) && s3==0)
            {
                return true;
            }
            if (s1>s2)
            {
                d = s2-s1;
            }
            else
            {
                d = s1-s2 ;
            }
            if (d > s3 || s1>req || s2>req)
            {
                return false;
            }
            return subsets(a3 , s3);
        }
    }
    public static void main(String[] args) {
        int a[] = { 1,4,2,3,5,6,7,8,9,10,11} ;
        System.out.println(splitArray(a));
    }

    public static boolean subsets(int input[] , int k)
    {
        int[][] ans1 = subarray(input , 0 , k);
        int sum=0 , l=0 ;
        for (int i=ans1.length-1 ; i<=ans1.length ; i++)
        {
            sum = 0 ;
            for (int j=0 ; j<ans1[i].length ; j++)
            {
                sum = sum + ans1[i][j];
            }
            if (sum == k)
            {
                return true;
            }
        }
        return false ;
    }

    public static int[][] subarray(int[] input , int index, int a)
    {
        if (index == input.length)
        {
            int[][] result = {{}} ;
            return result;
        }
        int[][] smallans = subarray(input , index+1,a);
        int[][] ans = new int[2*smallans.length][];
        int i , k , l;
        for ( i=0 ; i<smallans.length ; i++)
        {
            int sum=0 ;
            ans[i] = new int[smallans[i].length];
            k=0 ;
            for (int j=0 ; j<smallans[i].length ; j++)
            {
                ans[i][k] = smallans[i][j];
                k++ ;
                sum = sum + smallans[i][j];
            }
            if (sum == a)
            {
                return ans ;
            }
        }
        for ( ;i<ans.length ; i++)
        {
            int sum =0 ;
            ans[i] = new int[smallans[i-smallans.length].length+1];
            k=0 ;
            ans[i][k] = input[index];
            k++ ;
            for (int j=0 ; j<smallans[i-smallans.length].length ; j++)
            {
                ans[i][k] = smallans[i-smallans.length][j];
                k++ ;
                sum = sum + smallans[i-smallans.length][j];
            }
            if (sum == a)
            {
                return ans ;
            }
        }
        return ans;
    }
}
