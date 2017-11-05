package Arrays;
import java.util.Scanner;
/**
 * Created by Sneha on 15-06-2017.
 */
public class uniqueElement {

    public static int findUnique(int[] arr)
    {
        for( int i=0 ; i<arr.length ; i++)
        {
            int flag = 0 ;
            int j = i+1 ;
            while( j<arr.length && arr[i] != 0)
            {
                if( arr[i] == arr[j])
                {
                        arr[j] = -1;
                        flag = 0 ;
                        break;
                }
                else
                {
                        flag = 1;
                }
                j++ ;
            }
            if (flag == 1)
            {
                return arr[i];
            }
        }
        return arr[arr.length];

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int[] arr = new int[N];
        for(int i=0 ; i<N ; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println(findUnique(arr));
    }
}
