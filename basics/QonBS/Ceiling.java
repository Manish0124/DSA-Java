package basics.QonBS;

public class Ceiling {

    public static void main(String[] args) {

         int arr[] = { -22, -2, 0,1, 4, 5, 8, 9, 12, 45, 56, 67,99};
        int target = 10;
         System.out.println(Ceiling(arr,target));

    }


    // find the index of the smallest number greater>=target element
    static int Ceiling(int arr[], int target){

        //but what if the target is greater than  the greatest number in the array
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
            
            
        }

        return start;
    }
    
}