package basics.QonArray;

public class MaxAtIndex {
    public static void main(String[] args) {
        int arr[] = {4 ,2 ,3, 41 ,5,6,14};
        System.out.println(maxRange(arr, 0,6));
    }


    static int maxRange(int[] arr, int start, int end ){
        
        // edge cases

        // if(end>start){
        //     return -1;
        // }

        if(arr == null){
            return -1;
        }

        int maxValue = arr[start];
        for (int i = start; i < end; i++) {
            
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
            
        }

        return maxValue;

    }

}
