package dryAndRun;

import java.util.Scanner;

public class Revi {

    public static void main(String[] args) {
        System.out.println("thre");
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();

       int a = 0;
       int b = 1;

       int count = 2;
       
       while(count<=n) {
             int temp = b;
             b = a+b;
             a = temp;
             count++;
    };

    System.out.println(b);
}
}