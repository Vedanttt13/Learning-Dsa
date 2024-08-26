
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
