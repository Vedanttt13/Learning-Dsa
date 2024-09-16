public class PalindromeNumber {
    static void print(int a,int b){
        if(a==b){
            System.out.print(a+" ");
            return;
        }
        System.out.print(a+" ");
        print(a+1,b);
        System.out.print(a+" ");
    }
    public static void main(String[]args){
        print(1,5);
    }
}
