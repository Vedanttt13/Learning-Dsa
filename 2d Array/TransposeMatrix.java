// Transpose matrix the rows and cols are interchange
// in this type of matrix
// if rows and cols is 2*3 then the rows and cols are 3*2 in transpose matrix 
//

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][]a=new int[][]{{2,3,4},{9,8,5}};
        int[][]b=new int[a[0].length][a.length];
        
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
              b[i][j]=a[j][i];
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.err.println(" ");
        }
    }
}
