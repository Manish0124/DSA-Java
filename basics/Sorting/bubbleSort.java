package basics.Sorting;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        // int arr[] = { 5,4,3,2,1};
        int arr[] = { 1, 2,3 ,4,5};
    
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
     
        boolean swapped;
        //run the step n-1 times
     for (int i = 0; i < arr.length; i++) {
        swapped =  false;
        // for each step max item will come at last respective index 
    
        for (int j = 1; j < arr.length-i; j++) {
            // swap if the item is smaller than the previous item 
            if(arr[j]<arr[j-1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                swapped = true;
            }

            
        }
        //if you not swap for the particular value of i , it means the value is true so you have to not run in all value of i hence break it 
        
        if(!swapped){ //false
            break;
           }
     }
     
    
    }


}


