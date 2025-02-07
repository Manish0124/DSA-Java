package basics.Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {5,2,3,1,4};
             insertion(arr);
             System.out.println(Arrays.toString(arr));
        
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]) {
                    swapfun(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swapfun(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
