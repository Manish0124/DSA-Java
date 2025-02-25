package strings;

import java.util.Arrays;

public class method {
    public static void main(String[] args) {
        String s = "      rohan das";
        System.out.println(s);
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(s.strip());
        System.out.println(Arrays.toString(s.split(" ")));
    }
}
