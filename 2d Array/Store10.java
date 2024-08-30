// Write a program to store 10 at every index of a 2d matrix 
// with 5 rows and 5 cols

public class Store10 {

    public static void main(String[]args){
        int[][]a=new int [5][5];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=10;
            }
        }

        //print array
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
               System.out.print( a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
