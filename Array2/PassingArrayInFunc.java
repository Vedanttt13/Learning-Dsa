import java.util.*;

public class PassingArrayInFunc{

    public void display(int[] arr){
        for(int a:arr){
            System.out.println("Array Element is :"+a);
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Elements in the array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
       
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        PassingArrayInFunc p=new PassingArrayInFunc();

        p.display(arr);
    }
}