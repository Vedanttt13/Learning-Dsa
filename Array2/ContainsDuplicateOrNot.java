import java.util.HashMap;

public class ContainsDuplicateOrNot {
    public boolean check(int[]arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int [] arr= new int[]{2,2,3,5,6};
        ContainsDuplicateOrNot c=new ContainsDuplicateOrNot();
        if(c.check(arr))System.out.println("Array contains duplicates");
        else System.out.println("Array does not contains any duplicates ");
    }
}
