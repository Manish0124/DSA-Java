package recursion;

public class recursionTh {
    public static void main(String[] args) {
        print(1);
    }
 

    // recursion is a function call itself
    
    static void print(int n){
        // base condidtion
    //this is base condidtion --> where the recursion will stop making new calls
        if (n==5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);
        // recursive calls

        //this is tale recursion
        //this is last function call
        print(n+1);
    }
}
