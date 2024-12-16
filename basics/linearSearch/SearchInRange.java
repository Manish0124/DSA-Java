package basics.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 56, 112, 233, 1};
        int target = 112;
        int ans = search(arr, target , 1,3);
        System.out.println(ans);
    }

    // function to search in a particular range 

    static int search(int[] arr , int target, int start , int end ){
        if(arr.length == 0 ){
            return -1;
        }

    for (int i = start; i <=end; i++) {
        int element = arr[i];
        if(element == target){
            return i;
        }
    }
         return -1;
    }



}
