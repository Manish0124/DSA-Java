package QonRecursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        // SubSeqPart("", "abc");
        // System.out.println(SubSeqPartRet("", "abc"));
        // ascii("", "abc");
        System.out.println(SubSeqParAsciitRet("", "abc"));
    }

    static void SubSeqPart(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

         SubSeqPart( p + ch ,   up.substring(1) );
          SubSeqPart( p  ,   up.substring(1) );

    }


   
     
    static ArrayList<String> SubSeqPartRet(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

          ArrayList<String> left =  SubSeqPartRet( p + ch ,   up.substring(1) );
          ArrayList<String> right =  SubSeqPartRet( p  ,   up.substring(1) );
            
          left.addAll(right);
          return left;


    }

    // ascii value 

    static void ascii(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        ascii( p + ch ,up.substring(1) );
        ascii( p ,up.substring(1) );
        ascii( p + (ch+0),up.substring(1) );

    }

    static ArrayList<String> SubSeqParAsciitRet(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

          ArrayList<String> first =  SubSeqParAsciitRet( p + ch ,   up.substring(1) );
          ArrayList<String> second =  SubSeqParAsciitRet( p  ,   up.substring(1) );
          ArrayList<String> third =  SubSeqParAsciitRet( p + (ch+0)  ,   up.substring(1) );
            
          first.addAll(second);
          first.addAll(third);
          return first;


    }


}
