public class Fibonacci {
    static int fibo(int n){
        if(n<=1)return n;

       return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int n = 8; // Number of terms to print
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i));
        }
    }
}
