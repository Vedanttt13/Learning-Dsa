public class AdditionOfMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 4, 897, 34 }, { 1, 45, 56 } };
        int arr2[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 4, 897, 34 }, { 1, 45, 56 } };
        int res[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
