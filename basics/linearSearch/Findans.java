package basics.linearSearch;

public class Findans {
    public static void main(String[] args) {
        int[] arr = {11 ,4, 2 , -5, 87, 22,45};
        System.out.println(ansVal(arr));
    }


    // assume the array! = 0
    static int ansVal(int[] arr ){

        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }

        return ans;
        
    }

}
