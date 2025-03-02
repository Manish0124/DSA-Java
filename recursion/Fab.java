package recursion;

public class Fab {
    public static void main(String[] args) {
        // System.out.println(fab(6));
        System.out.println(fabiFormula(4));;
    }

    static int fab(int n ){
        // base condition
       if(n<2){
        return n;
       }
        return  fab(n-1) + fab(n-2);
    }
    
    //also called as golder ration 
    static int fabiFormula(int n){
             return (int) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
