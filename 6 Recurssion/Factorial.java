public class Factorial {

    static int fact(int n){

          
        // base case- hume ye deni pdti hai to stop the recurssion
        if(n==2) return 2;
        return n*fact(n-1);
    }
    public static void main(String[]args){
        System.out.println("The factorial is : "+fact(6));
    }
}
