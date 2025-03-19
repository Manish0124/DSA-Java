package basics.linearSearch;

public class Wealth {
    public static void main(String[] args) {
        int[][] account1 = {
            {1, 2, 3},
            {3, 21, 1, 1, 1},
            {4, 5, 6}
        };
        System.out.println(maxWealth(account1));
    }
   
   public static int maxWealth(int[][] accounts){
    // person -> row
    //account-> coumn
    int ans = 0;
    for( int person = 0; person < accounts.length; person++ ){
        //when you start a new column take a new sum of that row
        int sum = 0;
        for ( int account  = 0; account < accounts[person].length; account++) {
            sum+= accounts[person][account];
        }
            //now we have sum of account of person 
    //check with overall ans 
    if (sum>ans) {
        ans = sum;
    }
    }

    return ans;
   }
}
