public class WavePrinting {
    public static void main(String[] args) {
        int[][] a = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        
        int n = a.length;
        for(int i=0;i<n;i++) {
            if (i % 2 == 0||i==0) {
                for (int j = 0; j <= n; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println(" ");
            }
           else if(i%2!=0) {
                for (int j = n ; j >= 0; j--) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println(" ");
            }
            
        }
       
    }
}
