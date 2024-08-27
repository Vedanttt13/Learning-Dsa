public class RotateImage {
    public static void main(String[] args) {
        int[][] a = new int[][] { { 2, 3, 4 },
                { 9, 8, 5 },
                { 7, 10, 19 } };


        // Print matrix
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.err.println(" ");
        }
        

        //Transpose matrix
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int temp=a[j][i];
                a[j][i]=a[i][j];
                a[i][j]=temp;
            }
        }

        //print matrix
        for(int k=0;k<a.length;k++){
            int i=0;
            int j=a.length-1;
            while (i<=j) {
                int temp=a[k][i];
                a[k][i]=a[k][j];
                a[k][j]=temp;
                i++;
                j--;
            }
        }

        //print matrix
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.err.println(" ");
        }
    }
}
