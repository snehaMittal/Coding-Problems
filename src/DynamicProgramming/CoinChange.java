package DynamicProgramming;

import java.util.Arrays;

/**
 * Created by Sneha on 29-09-2017.
 */
public class CoinChange {
    static long countWays(int S[], int m, int n)
    {
        long[] table = new long[n+1];

        Arrays.fill(table, 0);

        table[0] = 1;

        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];

        return table[n];
    }
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3};
        int n = 4;
        System.out.println(countWays(arr, arr.length, n));
    }
}
