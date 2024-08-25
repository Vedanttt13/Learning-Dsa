public class Initialize {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 3 }, 
                                    { 4, 5, 6 }, 
                                    { 7, 8, 9 },
                                    {34,56,34}};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].length);
            System.out.println(arr.length);
            for(int j=0;j<arr[i].length;j++){
              
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}