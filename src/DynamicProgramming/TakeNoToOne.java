package DynamicProgramming;

/**
 * Created by Sneha on 13-08-2017.
 */
public class TakeNoToOne {
    public static int countStepsTo1(int n){
       int[] answer = new int[n+1];
       for (int i=0 ; i<answer.length ; i++){
           if (i == 0 || i == 1)
               answer[i] = 0;
           else if (i%2 == 0 && i%3 == 0)
               answer[i] = Math.min(Math.min(answer[i/2],answer[i/3]),answer[i-1]) + 1;
           else if (i%2 != 0 && i%3 != 0)
               answer[i] = answer[i-1] + 1;
           else if (i%2 == 0)
               answer[i] = Math.min(answer[i-1],answer[i/2]) + 1;
           else
               answer[i] = Math.min(answer[i-1],answer[i/3]) + 1 ;
       }
       return answer[n] ;
    }
    public static void main(String[] args) {

        System.out.println(countStepsTo1(5));
    }
}