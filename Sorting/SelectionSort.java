//Selection Sort 

public class SelectionSort {
    public static void main(String[] args){
        int []a={5,3,7,2,9,10};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n-1;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }

        //print sorted Array
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
       
    }
}
