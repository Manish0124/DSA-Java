package basics.TonArray;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDemensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // SYNTAX
    //    int[][] arr = new int[3][];

    //    int[][] arr2D = {
    //     {1,2,3},
    //     {4,5,6,7,8},
    //     {7,8,9,1},
    //    };

     int[][] arr = new int[3][3];
     System.out.println(arr.length);
     System.out.println("enter your 2D array input ");
    
     for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = in.nextInt();
        }
     }
//   FOR PRINITNG THE ARRAY
    //  for (int i = 0; i < arr.length; i++) {
    //     for (int j = 0; j < arr[i].length; j++) {
    //         System.out.print(arr[i][j]+ " ");
    //     }
    //     System.out.println();
    // }

    // ANOTHER WAY TO SHOW THE OUTPUT
    // for (int i = 0; i < arr.length; i++) {
    //     System.out.println(Arrays.toString(arr[i]));
    // }

    // next approach to print the array

    for(int[] a : arr){
        System.out.println(Arrays.toString(a));
    }


    }
}
