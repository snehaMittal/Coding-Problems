package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 22-06-2017.
 */
public class towerOfHanoi {


    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination)
    {
        if(disks == 1)
        {
            System.out.println(source + " " + destination);
        }
        else
        {
            towerOfHanoi(disks-1 , source , destination , auxiliary );
            System.out.println(source + " " + destination);
            towerOfHanoi(disks-1 , auxiliary , source , destination);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        towerOfHanoi(3 , 'a' , 'b' , 'c');

    }
}
