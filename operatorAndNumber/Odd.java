package operatorAndNumber;

public class Odd {

    public static void main(String[] args) {
        int num = 6887;
        System.out.println(isOdd(num));
    }

    public static boolean isOdd(int n){
      return (n&1)==1;
    }
}