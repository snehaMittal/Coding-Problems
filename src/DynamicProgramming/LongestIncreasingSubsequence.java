package DynamicProgramming;

/**
 * Created by Sneha on 27-09-2017.
 */
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
        System.out.println(LISubseq(arr));
    }

    private static int LISubseq(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i=0 ; i<answer.length ; i++){
            answer[i] = 1 ;
        }
        for (int i=1 ; i<arr.length ; i++){
            for (int j=0 ; j<i ; j++){
                if (arr[j] < arr[i]){
                    answer[i] = Math.max(answer[i] , answer[j]+1) ;
                }
            }
        }
        int max = answer[0];
        for (int i=1 ; i<answer.length ; i++){
            if (answer[i] > max)
                max = answer[i];
        }
        return max;
    }
}
