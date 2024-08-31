// Print the digonal elements of the matrix

public class DiagonalElements {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4, 20 },
                      { 5, 6, 7, 8, 19 },
                      { 9, 10, 11, 12, 18 },
                      { 13, 14, 15, 16, 17 },
                      { 13, 14, 15, 16, 17 }
        };

        int n=a.length;
        int b=n;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||j==b-1){
                    System.out.print(a[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            b--;
            System.out.println(" ");
        }

    }
}
