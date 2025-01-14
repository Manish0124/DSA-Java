package dryAndRun;

import java.util.Arrays;

public class brushup {

    public static void main(String[] args) {
       fun("hii","what ");
    }

    static void fun(String ...v){
     System.out.println(Arrays.toString(v));
    }
}