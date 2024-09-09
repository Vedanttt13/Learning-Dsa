public class BubbleSort1{
    public static void main(String[] args){
        int [] a={3,4,5,2,54,7,9};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}