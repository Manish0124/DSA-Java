//continue on that -1
package basics.QonBS;

public class FindOnMountain {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7,8, 9};
        int target = 5;
        System.out.println(search(arr, target));
        
    }

    static int search(int[] arr , int target){
       
        int peak = PeakIndexInMountainArray(arr);
        int firstTry = OrderAgnostic(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        //search in second half
        return OrderAgnostic(arr, target, peak + 1, arr.length - 1);
    }



    static int OrderAgnostic(int arr[], int target , int start , int end){
         

        boolean isAsce = arr[start] < arr[end];

       while (start<=end) {
         int mid = start + (end-start)/2;
         if(arr[mid] == target){
            return mid;
         }
         
         if (isAsce) {
            if(target<arr[mid]){
                 end = mid -1 ;
            }
            else{
                start = mid + 1;
            }

       }
       else{
        if (target>arr[mid]) {
            end = mid -1;
        }
        else{
            start = mid +1;
        }
       }
    }
    return -1;
    }

    static int  PeakIndexInMountainArray(int arr[]){
        int start = 0;
        int end = arr.length -1;
        
        while (start<end) {
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid ;
            }
            
            else{
              start = mid +1 ;

            }
        }
          return start;
    }
}
