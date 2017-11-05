package Test2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sneha on 10-07-2017.
 */
public class ques3 {
    public static int maximumProfit(int budget[])
    {
        Arrays.sort(budget);
        int max = Integer.MIN_VALUE;
        for (int i=0 ; i<budget.length ; i++)
        {
            int profit = budget[i] * (budget.length-i);
            if (profit > max)
            {
                max = profit ;
            }
        }
        return max ;
    }
    public static void main(String[] args) {
       int a[] = {1,2,6,8,10};
        System.out.println(maximumProfit(a));
    }
}
