package basics.Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
              int arr[] = { 5,4,3,2,1};
            //   int arr[] = { -1,2,0};
    
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    // in selection sort index with max value will be replaced with last index and get sort from last 

    static void Selection(int[] arr){
       for (int i = 0; i < arr.length; i++) {
         //find the max item in the remaning array and swap with correct index 

         int last = arr.length-i-1;
        //  int maxIndex = getMaxIndex(arr,start,end)
         int maxIndex = getMaxIndex(arr, 0 , last);

         swap(arr, maxIndex, last);
       }
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    
    static int getMaxIndex(int[] arr, int start , int end){

         int max = start;
         for (int i = 0; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
