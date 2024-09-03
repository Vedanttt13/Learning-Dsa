import java.util.*;

public class SetZeroMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 6 }, { 1, 2, 3, 4 } };
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    cols.add(j);
                }
            }
        }
        if (row.size() != 0) {
            for (int i = 0; i < row.size(); i++) {
                int k = row.get(i);
                for (int j = 0; j < n; j++) {
                    matrix[k][j] = 0;
                }
            }
        }
        if (cols.size() != 0) {
            for (int i = 0; i < cols.size(); i++) {
                int k = cols.get(i);
                for (int j = 0; j < m; j++) {
                    matrix[j][k] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
