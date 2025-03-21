package QonRecursion;

public class Skip {
    public static void main(String[] args) {
        // skipCh("", "bacab");

        // System.out.println(skipCh2("bacab"));
        // System.out.println(skipApple("bacappleab"));
        System.out.println(skipAppNotApple("bacappeab"));
    }

    static void skipCh(String p , String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skipCh(p, up.substring(1) );
        }

        else {
            skipCh( p + ch, up.substring(1));
        }
    }


    static String skipCh2(String up){
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        
        if (ch == 'a') {
            return skipCh2(up.substring(1));
        }
        else {
            return ch + skipCh2(up.substring(1));
        }
    }

    static String skipApple(String up){
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    static String skipAppNotApple(String up){
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app" ) && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
