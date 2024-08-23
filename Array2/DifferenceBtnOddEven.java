public class DifferenceBtnOddEven {
    public static void main(String[]args){
        int[] nums=new int[]{1,2,3,4,5,7,9};
        int even=0;
        int odd=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0)even+=nums[i];
            else odd+=nums[i];
        }
       
        System.out.println(even-odd);
    }
}
