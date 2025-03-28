package basics.Sorting;

import java.util.Arrays;

public class QuicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(null, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low , int hi){
        if (low>=hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while (s<=e) {
            // also a reason why if it is sorted it will not swap 
            while (arr[s] < pivot) {
                 s++;
            }

            while (arr[s] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index , please sort two haves now

         sort(arr, low, e);
         sort(arr , s, hi);
    }
}
