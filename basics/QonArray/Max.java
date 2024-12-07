package basics.QonArray;

public class Max {
    public static void main(String[] args) {
        int arr[] = { 1, 2,43,6,7};
        System.out.println(max(arr));
    }

    // assuming that first one is max
    
        // Imagine array is not empty
     
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {

         
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
