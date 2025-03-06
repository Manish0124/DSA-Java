package recursion.recursionType2;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        
        int target = 2;
        int[] arr = {1,23,34,2,2,11,45};
        // System.out.println(findIndex(arr, target, 0));
        // findAllIndex(arr, target, 0);
        // System.out.println(list);

         ArrayList<Integer> ans =  findallIndex(arr, target, 0, new ArrayList<>()  );
        System.out.println(ans);
    }

    static boolean find(int[] arr,int target, int index){
        if (index==arr.length) {
            return false;
        }

        return arr[index]==target || find(arr, target, index+1);
    }
    static int findIndex(int[] arr,int target, int index){
        if (index==arr.length) {
            return -1;
        }

        if (arr[index]==target) {
            return index;
        }

        else {
          return  findIndex(arr, target, index+1);
        }

        
    }
    
    // static ArrayList<Integer> list = new ArrayList<>();
    // static void findAllIndex(int[] arr,int target, int index){
    //     if (index==arr.length) {
    //         return ;
    //     }

    //     if (arr[index] == target) {
    //         list.add(index);
    //     }

    //     findAllIndex(arr, target, index+1);

    // }

    static ArrayList<Integer> findallIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index==arr.length) {
            return list;
        }

        if (arr[index]==target) {
            list.add(index);
        }

        return findallIndex(arr, target, index+1, list);
    }
}
