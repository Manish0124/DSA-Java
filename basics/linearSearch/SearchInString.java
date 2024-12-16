package basics.linearSearch;

import java.util.Arrays;

public class SearchInString {

    public static void main(String[] args) {
     String name = "Sinchin";
     char target = 'S';
    //  System.out.println(search(name, target));
    // internally it is happening to this 
    // System.out.println(Arrays.toString(name.toCharArray()));
    System.out.println(search2(name, target));
     
    }


    //second approach usning foreach 
     
    static boolean search2(String str, char target){
        if (str.length() == 0) {
            return false;
        }
       
        for (char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }

        }
        return false;

    }

    // first approach
     static boolean search(String str , char target){
        if(str.length() == 0){
            return false;
        }

      for (int i = 0; i < str.length(); i++) {
        if(target == str.charAt(i)){
            return true;
        }
      }

      return false;

     }
}