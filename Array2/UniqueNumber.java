/*     getOrDefault(): This method is used to get the value associated with the key. 
       If the key is not present, it returns the default value (in this case, 0)     */


import java.util.*;
public class UniqueNumber {
    public static void main(String[]args){
        int[] arr=new int[]{1,1,2,2,3,3,4};
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else map.remove(arr[i]);
        }
        for(int a:map.keySet()){
            System.out.println(a);
        }
    }
}
