public class SmallestElement {
    public int smallestelement(int[]arr){
        int sm=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<sm) sm=arr[i];
        }
        return sm;
    }

    public static void main(String[]args){
        int [] arr=new int[]{2,3,4,5,7,8};
        SmallestElement s=new SmallestElement();
        System.out.println("The Smallest Element in the array is "+s.smallestelement(arr));
    }
}
