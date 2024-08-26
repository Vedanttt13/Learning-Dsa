// You are given a matrix/2D- Array of size (n*n)(eg. 3*3)
// change this matrix into its transpose.

public class TransposeMatrix2 {
    public static void main(String[] args) {
        int[][] a = new int[][] { { 2, 3, 4 },
                { 9, 8, 5 },
                { 7, 10, 19 } };

        for (int i = 0; i < a[0].length; i++) {
          for (int j = 0; j < a.length; j++) {
               System.out.print(a[i][j]+" ");
               }
         System.err.println(" ");
        }

        int temp = 0;
        for (int i = 0; i < a[0].length; i++) {
            for (int j = i; j < a.length; j++) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.err.println(" ");
        }
    }
}
