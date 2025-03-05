package recursion.recursionType1;

public class NumberOfSteps {
    public static void main(String[] args) {

        int ans = steps(8);
        System.out.println(ans);
        
    }

    static int steps(int n){
        return helper( n, 0);
    }

    static int helper(int n, int s){

        if (n ==0) {
            return s;
        }
        if (n % 2 ==0) {
            return helper(n/2, s+1);
        }
        return helper(n-1, s+1);
    }
}
