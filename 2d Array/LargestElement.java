public class LargestElement {
    public static void main(String[]args){
        int [][]arr={{1,2,4,5},{45,67,23,78},{13,173,24,65}};
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(max<arr[i][j]) max=arr[i][j];
            }
        }
    System.out.println(max);
    }

}
