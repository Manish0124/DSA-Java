package basics.linearSearch;

public class LSearch {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 64, 32, -3, 99 };
        int target = 644;
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }

    // search in the array : return the index if item found
    // not found : return -1

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for the loop

        for (int i = 0; i < arr.length; i++) {
            // check for the element for every index if it == target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // this line will excute if none of the return statement will execute
        // hence target not found
        return -1;

    };

}
