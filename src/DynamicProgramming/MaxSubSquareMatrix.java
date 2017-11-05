package DynamicProgramming;

/**
 * Created by Sneha on 16-08-2017.
 */
public class MaxSubSquareMatrix {
    static int max=0;
    public static int findMaxSquareWithAllZeros(int[][] input){
        int[][] answer = new int[input.length+1][input[0].length+1];
        for (int i=0 ; i<1 ; i++){
            for (int j=0 ; j<answer[0].length ; j++){
                answer[i][j] = 0;
                if (j < answer.length){
                    answer[j][i] = 0;
                }
            }
        }
        for (int i=1 ; i<answer.length ; i++){
            for (int j=1 ; j<answer[0].length ; j++){
                if (input[i-1][j-1] == 1) {
                    answer[i][j] = 0 ;
                }
                else {
                    answer[i][j] = Math.min(Math.min(answer[i - 1][j], answer[i][j - 1]), answer[i - 1][j - 1]) + 1 ;
                    if (answer[i][j] > max)
                        max = answer[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] array = {{1,0,0,0,0,1},{1,0,0,0,1,1},{1,1,1,1,1,1}};
        System.out.println(findMaxSquareWithAllZeros(array));
    }
}
