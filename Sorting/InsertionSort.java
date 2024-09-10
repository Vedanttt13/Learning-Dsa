public class InsertionSort {
    public static void main(String[] args) {
        int []a={5,3,7,2,9,10};
        int n=a.length;
        for (int i = 1; i <n; i++) {
            int j=i;
            while(j>=1 &&a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
