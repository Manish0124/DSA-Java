package basics.linearSearch;

public class EvenDigit {
    public static void main(String[] args) {
        //question
        int[] nums = {-12,123, 34444, 212222};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(1233));
    }
    
    //find numbers

    static int findNumbers(int[] nums){
        int count = 0;
        
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        
        return count;
    }

    // even function
    static boolean even(int num){
        int numbersOfDigit = digits(num);
        // if(numbersOfDigit%2==0){
        //     return true;
        // }
        // return false;
        return numbersOfDigit % 2 == 0;
    }

    static int digits2(int num){
        if (num<0) {
            num = num* -1;
        }
        return (int)(Math.log10(num) + 1 );
    }

    static int digits(int num){
        if (num<0) {
         num = num * -1;
        }
        
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while ( num>10) {
            count++;
            num/=10;
        }

        return count;

    }

}
