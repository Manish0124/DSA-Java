package basics.binarySearch;

public class TonBinary {
    public static void main(String[] args) {
        int arr[] = { -22, -2, 0,1, 4, 5, 8, 9, 12, 45, 56, 67,99};
        int target = -2;
        System.out.println(binarySearch(arr, target));
    }
     
    //return the index
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            //mid index
            // int mid = start + end / 2 ; might be possible that (start+end ) exceed the range of int in ja
            int mid = start + (end-start)/2;
            if (target < arr[mid] ) {
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
