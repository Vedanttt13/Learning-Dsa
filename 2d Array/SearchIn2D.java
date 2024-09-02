public class SearchIn2D {

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 2, 3, 4 },
                { 9, 8, 5 },
                { 7, 10, 19 } };
        int target = 5;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println("Find");
                break;
            } else if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        System.out.println("Not found");
    }

}
