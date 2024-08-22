import java.util.*;

public class SyntaxAndDeclaration{
    public static void main(String[]args){
        // int arr[]=new int[10];
        // arr[0]=0;
        // arr[1]=1;
        // System.out.println(arr[0]);

        int nums[]=new int[2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
           
        }
        System.out.println("Array Printed");
        for(int i=0;i<nums.length;i++)
        {
           
            System.out.println(nums[i]);
        }
        sc.close();
    }
}