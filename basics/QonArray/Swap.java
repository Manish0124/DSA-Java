package basics.QonArray;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr2[] = {1 , 2, 3, 4,5};
    //    swap(arr2, 1, 2);
    reverseSwap(arr2);

       System.out.println(Arrays.toString(arr2));
    }
    
    // checking 

    // swaping of the array
   static void reverseSwap(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
   }
   
    

    static void swap(int[] arr , int  index1, int index2){
         int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
    }
}
