package DynamicProgramming;

/**
 * Created by Sneha on 17-08-2017.
 */
public class LongestCommonSubsequence {

    public static int lcs(String s1, String s2){
        int[][] answer = new int[s1.length()+1][s2.length()+1];
        for (int i=0 ; i<answer.length ; i++){
            for (int j=0 ; j<answer[0].length ; j++){
                if (i == 0)
                    answer[i][j] = 0;
                else if (j == 0)
                    answer[i][j] = 0;
                else if (s1.charAt(i-1) == s2.charAt(j-1))
                    answer[i][j] = answer[i-1][j-1] + 1;
                else
                    answer[i][j] = Math.max(answer[i-1][j] , answer[i][j-1]);
            }
        }
        return answer[answer.length-1][answer[0].length-1];
    }
    public static void main(String[] args) {
        System.out.println(lcs("adebc" , "dcadb"));
    }
}
