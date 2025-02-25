package basics.Sorting.SortingQ;

public class missingNumber {
    public static void main(String[] args) {

        int[] arr = {0,1,2,3};
        System.out.println(MissingN(arr));
        
    }

    public static int MissingN(int[] arr){
        int i = 0;
        while (i<arr.length) {
             //as there is missing number so we use arr[i]
             int correct = arr[i];
             if( arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr, i , correct );
             }
             else{
                i++;
             }
        }

        //search for the first missing number 
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!= index) {
                return index;
            }
        }

        //case 2 

        return arr.length;

    }

    static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
