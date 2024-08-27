public class RotatePrintedArray {
    public static void main(String[] args) {
        int[][] a = new int[][] { { 2, 3, 4 },
                { 9, 8, 5 },
                { 7, 10, 19 } };

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.err.println(" ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j >= 0; j--) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
