package backtracing;

import java.util.ArrayList;

public class Maze {

    //maze problem 
    public static void main(String[] args) {
        System.out.println(maze(3,3));
        // path("", 3, 3);

        // ArrayList<String> ans = pathDiagnolRet("", 3, 3);
        // System.out.println(ans);

        boolean[][] boat = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
        };

        pathRestrication("", boat, 0, 0);

    }

    static int maze(int r , int c){
        if (r==1||c==1) {
            return 1;
        }

        int left = maze(r-1, c);
        int right = maze(r, c-1);

       return  left + right;

    }


    static void path(String p , int r , int c ){
        if (r==1&&c==1) {
            System.out.println(p);
            return;
        }

        if (r>1) {
            path( p + 'D' , r -1 , c);
        }

        if (c>1) {
            path( p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p , int r , int c ){
        if (r==1&&c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r>1) {
           list.addAll(pathRet( p + 'D' , r -1 , c));
        }

        if (c>1) {
            list.addAll(pathRet( p + 'R', r, c - 1));
        }

        return list;
    }

    //you can move diagnol also 
    static ArrayList<String> pathDiagnolRet(String p , int r , int c ){
        if (r==1&&c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r>1&&c>1) {
           list.addAll(pathDiagnolRet( p + 'D' , r -1 , c-1));
        }
        if (r>1) {
           list.addAll(pathDiagnolRet( p + 'V' , r -1 , c));
        }

        if (c>1) {
            list.addAll(pathDiagnolRet( p + 'H', r, c - 1));
        }

        return list;
    }


    //if there is obstdacle we cannot move there we have to just  return the value;

    static void pathRestrication(String p , boolean[][] maze , int r , int c){
        if (r == maze.length - 1 && c== maze[0].length-1 ) {
            System.out.println(p);
            return ;
        }

        if (maze[r][c] == false) {
            return;
        }

        if (r< maze.length - 1) {
            pathRestrication(p + 'D' , maze, r + 1, c);
        }
        if (c< maze.length - 1) {
            pathRestrication(p + 'R' , maze, r, c+1);
        }

       

    }
    
}
