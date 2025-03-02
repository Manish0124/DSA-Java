package operatorAndNumber;

public class Unique {
    public static void main(String[] args) {
        int[] arr = { 1,2,1,2,4,5,5};
        System.out.println(isUniqueOne(arr));
    }

    public static int isUniqueOne(int[] arr){
       
        int unique = 0;

        for(int n : arr){
             unique^=n;
        }

        return unique;
    }
}
