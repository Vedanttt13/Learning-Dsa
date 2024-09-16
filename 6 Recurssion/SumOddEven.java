public class SumOddEven {
    static int sumOdd(int a,int b){
        if(a>b) return 0;
        if(a%2!=0){
           return a+sumOdd(a+2,b);
        }
        return sumOdd(a+1,b);
    }
    static int sumEven(int a,int b){
        if(a>b) return 0;
        if(a%2==0){
           return a+sumEven(a+2,b);
        }
        return sumEven(a+1,b);
    }
    public static void main(String[] args) {
        System.out.println("Sum of odd : "+sumOdd(5,10));
        System.out.println("Sum of Even : "+sumEven(5,10));
    }   
}
