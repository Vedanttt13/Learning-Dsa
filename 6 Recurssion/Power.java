public class Power {
    static int calculatepower(int a,int b){
        if(0==b)return 1;
        return a*calculatepower(a, b-1);
        }
    public static void main(String[] args){
        System.out.println(calculatepower(2,3));
    }
}
