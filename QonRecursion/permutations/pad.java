package QonRecursion.permutations;

public class pad {
    public static void main(String[] args) {
        pad("", "12");
    }

    static void pad(String p , String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit  = up.charAt(0) - '0'; //this will convert '2' to 2
        for (int i =  (digit -1) * 3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            pad(p + ch , up.substring(1));
        }
    }
}
