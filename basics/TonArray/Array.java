package basics.TonArray;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(Stringarray[] args) {
            Scanner in = new Scanner(System.in);
            //  SYNTAX --> datatype[] variable_name = new datatype[size]; 

              int[] rows = new int[5];
            //   System.out.println(rows[1]);

            //  int[] columns = {1, 2 ,3, 6, 7};

            int[] ros ;  //  declaration of an array , ros is getting defined in the stack 
            ros = new int[5];  // initializatin : actually object is created in the memory(heap)

            Stringarray[] str = new Stringarray[4];
            // System.out.println(str[3]);
           

            // input using the loop

            int arr[] = new int[5];
            for( int i = 0; i<arr.length ; i++ ){
                arr[i] = in.nextInt();
                // System.out.println(i);
            }

            // for (int i = 0; i < arr.length; i++) {
            //     System.out.println(arr[i]);
            // }
        
             //FOR EACH LOOP
            // for(int num: arr){        //for every element in array , print the array
            //     System.out.println(num); // here num represent element of arrray 
            // }
            
            System.out.println(Arrays.toString(arr));
    }
}
    