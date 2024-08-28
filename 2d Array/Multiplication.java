import java.util.*;

public class Multiplication {
    public static void main(String[] args) {

        int m = 2;
        int n = 3;
        int p = 3;
        int q = 4;

        int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] b = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        int res[][] = new int[m][q];
       
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    res[i][j] = res[i][j] + a[i][k] * b[k][j];
                }
            }

        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
