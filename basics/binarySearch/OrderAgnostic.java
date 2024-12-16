package basics.binarySearch;

public class OrderAgnostic {

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 12, 14, 26, 30, 32, 34};
        //descending arr
        int[] arr = {9, 8 , 5, 3, 2, 1, -5, -6, -12};
        int target =    12;
        System.out.println(OrderAgnosticBS(arr, target));
        
    }


    static int OrderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        //find the arrray whether the array is sorted in Ass or Dess
        boolean isAssending = arr[start]<arr[end];

        while (start<=end) {
            //find the middle element 
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if (isAssending) {
                if(target<arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid +1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
       return -1;
    }
}