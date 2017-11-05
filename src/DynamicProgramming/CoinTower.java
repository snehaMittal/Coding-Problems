package DynamicProgramming;

/**
 * Created by Sneha on 18-08-2017.
 */
public class CoinTower {

    public static String solve(int n,int x,int y){

        if (x > y){
            int temp = x;
            x = y ;
            y = temp;
        }
        int[] answer = new int[n+1];

        for (int i=0 ; i<answer.length ; i++){
            if (i ==0 || i== 1)
                answer[i] = i ;
            else if (i >= x && i >= y){
                if (Math.min(Math.min(answer[i-1] , answer[i-x]), answer[i-y]) == 0)
                    answer[i] = 1;
                else
                    answer[i] = 0 ;
            }
            else if (i >= x && i <y){
                if (Math.min(answer[i-1],answer[i-x]) == 0)
                    answer[i] = 1;
                else
                    answer[i] = 0;
            }
            else {
                if (answer[i-1] == 0)
                    answer[i] = 1;
                else
                    answer[i] = 0;
            }
        }

        if (answer[n] == 1)
            return "Beerus" ;
        else
            return "Whis";
    }

    public static void main(String[] args) {
        System.out.println(solve(2222 ,2,3));
    }
}
