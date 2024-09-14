public class Sum1toNParamater {
    static void sum1toN(int sum,int n){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum1toN(sum+=n, n-1);
        
    }
    public static void main(String[] args) {
        sum1toN(0,4);
    }
}
