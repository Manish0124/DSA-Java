package recursion;

public class BS {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 23, 34, 122,243};
        int target = 53;
        System.out.println(bs(arr, target, 0, arr.length));
        
    }


    static int bs(int[] arr, int target, int s, int  e){
        
        if (s>e) {
            return -1;
        }

        int m = s+ (e-s)/2;

        if (arr[m]==target) {
            return m;
        }
        if (target<arr[m]) {
           return bs(arr, target, s, m-1);
        }

        return bs(arr, target, m+1, e);

        
    }
}
