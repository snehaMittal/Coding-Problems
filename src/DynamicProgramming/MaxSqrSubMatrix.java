package DynamicProgramming;

/**
 * Created by Sneha on 27-09-2017.
 */
public class MaxSqrSubMatrix {

    public static void main(String[] args) {

        int M[][] =  {{0, 1, 1, 0, 1},
                      {1, 1, 0, 1, 0},
                      {0, 1, 1, 1, 0},
                      {1, 1, 1, 1, 0},
                      {1, 1, 1, 1, 1},
                      {0, 0, 0, 0, 0}};

        printMaxSubSquare(M);
    }

    private static void printMaxSubSquare(int[][] m) {

        int[][] helper = new int[m.length][m[0].length];

        for (int i=0 ; i<helper.length ; i++){
            helper[i][0] = m[i][0];
        }

        for (int i=0 ; i<helper[0].length ; i++){
            helper[0][i] = m[0][i];
        }

        for (int i=1 ; i<helper.length ; i++){
            for (int j=1 ; j<helper[0].length ; j++){
                if (m[i][j] == 1)
                    helper[i][j] = Math.min(helper[i-1][j-1] , Math.min(helper[i-1][j] , helper[i][j-1])) + 1;
                else
                    helper[i][j] = 0 ;
            }
        }
        max_of_helper(helper , m);
    }

    private static void max_of_helper(int[][] helper , int[][] m) {
        int max_of_helper = helper[0][0] , max_i = 0 , max_j = 0 ;
        for (int i=0 ; i<helper.length ; i++){
            for (int j=0 ; j<helper[0].length ; j++){
                if (max_of_helper < helper[i][j]){
                    max_of_helper = helper[i][j] ;
                    max_i = i ;
                    max_j = j ;
                }
            }
        }

        printAnswer(m , max_i , max_j , max_of_helper);
    }

    private static void printAnswer(int[][] m, int max_i, int max_j, int max_of_helper) {

        for (int i = max_i-max_of_helper+1 ; i<=max_i ; i++){
            for (int j = max_j-max_of_helper+1 ; j<=max_j ; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
