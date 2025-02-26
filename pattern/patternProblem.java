package pattern;

public class patternProblem {
    public static void main(String[] args) {

        // pattern1(4);
        // pattern2(4);
        // pattern3(4);
        // pattern4(4)
        // pattern5(6);
        pattern6(6);

    }

    // static void pattern1(int n){
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <=row; col++) {
    // System.out.print("* ");
    // }
    // System.out.println(" ");
    // }

    // }

    // static void pattern2( int n){
    // for (int row = 1; row<=n; row++) {
    // for (int col = 1; col <=n; col++) {
    // System.out.print("* ");
    // }
    // System.out.println(" ");
    // }

    // }

    // static void pattern3( int n){
    // for (int row = 1; row<=n; row++) {
    // for (int col = 1; col <=n-row + 1; col++) {
    // System.out.print("* ");
    // }
    // System.out.println(" ");
    // }

    // }

    // static void pattern4( int n){
    // for (int row = 1; row<=n; row++) {
    // for (int col = 1; col <=row; col++) {
    // System.out.print(col);
    // }
    // System.out.println(" ");
    // }

    // }

    // static void pattern4(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print(col);
    // }
    // System.out.println(" ");
    // }

    // }

    // static void pattern5(int n) {
    // for (int row = 0; row < 2 * n; row++) {

    // int numbeOfCols = row > n ? 2 * n - row : row;

    // for (int col = 0; col < numbeOfCols; col++) {
    // System.out.print("* ");
    // }
    // System.out.println(" ");
    // }

    // }

    static void pattern6(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int numbeOfCols = row > n ? 2 * n - row : row;
            int numberOfSpaces = n - numbeOfCols;
            for (int s = 0; s < numberOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < numbeOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

}
