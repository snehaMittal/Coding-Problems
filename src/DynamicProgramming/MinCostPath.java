package DynamicProgramming;

/**
 * Created by Sneha on 17-08-2017.
 */
public class MinCostPath {

    public static int minCostPath(int input[][]){
        int[][] answer = new int[input.length][input[0].length];
        for (int i=0 ; i<answer.length ; i++){
            for (int j=0 ; j<answer[0].length ; j++){
                if (i==0 && j==0)
                    answer[i][j] = input[i][j];
                else if (i == 0)
                    answer[i][j] = answer[i][j-1] + input[i][j];
                else if (j == 0)
                    answer[i][j] = answer[i-1][j] + input[i][j];
                else
                    answer[i][j] = Math.min(Math.min(answer[i-1][j] , answer[i][j-1]),answer[i-1][j-1]) + input[i][j];
            }
        }
        return answer[answer.length-1][answer[0].length-1];
    }
    public static void main(String[] args) {
        int[][] input = {{3,4,1,2},{2,1,8,9},{4,7,8,1}};
        System.out.println(minCostPath(input));
    }
}
