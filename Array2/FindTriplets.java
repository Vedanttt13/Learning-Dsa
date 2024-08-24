import java.util.Arrays;
class FindTriplets {

    public boolean find3Numbers(int arr[], int n, int x) {
        Arrays.sort(arr); 
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                
                if (sum == x) {
                    return true;
                } else if (sum < x) {
                    left++; 
                } else {
                    right--;
                }
            }
        }
        
        
        return false;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,8};
        FindTriplets f=new FindTriplets();
        System.out.println(f.find3Numbers(arr, arr.length, 8));
    }

}