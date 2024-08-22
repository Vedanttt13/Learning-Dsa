public class SecondLargestElement {

    public int Element(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ) {
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax&& arr[i]<max){
                smax=arr[i];
            }
        }

        return smax;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 3, 5 };
        SecondLargestElement s = new SecondLargestElement();
        int ele = s.Element(arr);
        System.out.println("The Second smallest element in array is : " + ele);
    }
}
