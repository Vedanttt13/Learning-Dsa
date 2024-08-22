public class FindMax {

    // Find the maximum element from the array
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 634, 1234, 567, 34 };
        // int max=arr[0];
        // for(int i=0;i<arr.length;i++){
        // if(arr[i]>max){
        // max=arr[i];
        // }
        // }
        // System.out.println(max);

        // Find the second max element in the arrary
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(smax);

    }
}
