public class SortedOrNot {
    public boolean cheak(int[]nums){
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]) return false;
        }
        return true;
    }
    public static void main(String[]args){
        int[]nums=new int[]{1,2,3,5,4,6,7};
        SortedOrNot s=new SortedOrNot();
        System.out.println(s.cheak(nums));
    }
}
