package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(7);
        // list.add(23);
        // list.add(233);
        // list.add(253);
        // list.add(273);
   
        // System.out.println(list.contains(2335));

        // list.set(0, 112);

        // System.out.println(list);

    //  taking input through loop
    for (int i = 0; i < 5; i++) {
        list.add(in.nextInt());
    }

    // output
    // get item at any index
    for (int i = 0; i < 5; i++) {
        System.out.println(list.get(i)); //pass index here , list[index] syntax will not work here 
    }

    }
}
