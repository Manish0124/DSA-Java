package recursion;

public class Fab {
    public static void main(String[] args) {
        System.out.println(fab(6));
    }

    static int fab(int n ){
        // base condition
       if(n<2){
        return n;
       }
        return  fab(n-1) + fab(n-2);
    }
}
