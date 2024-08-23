public class CountElementsGreaterThanX {
    public int count(int[]nums,int x){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>4){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int []nums=new int[]{2,34,65,4,65,3,2,3};
        CountElementsGreaterThanX c=new CountElementsGreaterThanX();
        System.out.println("The number of element greater than X are "+ c.count(nums, 4));
    }
}
