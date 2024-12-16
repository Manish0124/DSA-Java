package basics.linearSearch;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        
        int arr[][] = {
            {12 , 3, 122, 145, 34},
            {1, 32, 4, 7},
            {67,43},
        };

        int ans = searchMax2(arr);
        System.out.println((ans));
    }


    //first approach 
//    static int searchMax(int[][] arr){
//      int maxValue = Integer.MIN_VALUE;
//      for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[i].length; j++) {
//             if (arr[i][j]>maxValue) {
//                 maxValue = arr[i][j];
//             }
//         }

//     }
//     return maxValue;
//    }
 

   //second approach 

   static int searchMax2(int[][] arr){
    int maxValue = Integer.MIN_VALUE;
    for (int[] ints : arr) {
        for (int element : ints) {
            if(element > maxValue){
                maxValue = element;
            }
        }
    }
    return maxValue;
}

}
