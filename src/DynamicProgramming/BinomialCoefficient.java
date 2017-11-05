package DynamicProgramming;

/**
 * Created by Sneha on 26-09-2017.
 */
public class BinomialCoefficient {

    private static int binomialCoeff(int n, int k) {

        int[][] answer = new int[n+1][k+1];

        for (int i=0 ; i<=n ; i++){
            for (int j=0 ; j<=Math.min(i,k) ; j++){
                if (j==0 || j==i)
                    answer[i][j] = 1;
                else
                    answer[i][j] = answer[i-1][j-1] + answer[i-1][j];
            }
        }
        return answer[n][k];
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2 ;
        System.out.println(binomialCoeff(n , k));
    }

}
