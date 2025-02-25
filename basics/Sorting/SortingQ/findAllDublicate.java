package basics.Sorting.SortingQ;

import java.util.ArrayList;
import java.util.List;

public class findAllDublicate {
    public static void main(String[] args) {
        //  int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
         int[] arr = {4, 7, 8, 2, 3, 1};
        System.out.println(findAllDublicateValue(arr));
    }

    public static List<Integer> findAllDublicateValue(int[] arr){
        int i = 0;
        List<Integer> ans = new ArrayList<>();  // Initialize the list outside the loop
        while (i < arr.length) {
            int correct = arr[i] - 1;

            // If arr[i] is at its correct position, just move on
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // After sorting, collect duplicates
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }
        
        return ans;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
