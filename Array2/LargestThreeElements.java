public class LargestThreeElements {
    public void find(int[]nums){
        int l1=Integer.MIN_VALUE;
        int l2=Integer.MIN_VALUE;
        int l3=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>l1){
                l3=l2;
                l2=l1;
                l1=nums[i];
            }   
            else if(nums[i]<l1&&nums[i]>l2){
                l3=l2;
                l2=nums[i];
            }
            else {
                l3=nums[i];
            }
        }
        System.out.println("1: "+l1+" 2: "+l2+" 3: "+l3);
    }
    public static void main(String[]args){
        int[]nums=new int[]{2,4,5,75,7,62,56};
        LargestThreeElements l=new LargestThreeElements();
        l.find(nums);
    }
}
