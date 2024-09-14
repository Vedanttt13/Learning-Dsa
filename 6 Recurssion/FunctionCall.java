public class FunctionCall{
    int fun(int i){
        System.out.println("Hello my name is vedant "+i);
        if(i==10){
            return 0;
        }
      
        return fun(i+1);
    }
    public static void main(String[]args){
        FunctionCall f=new FunctionCall();
        f.fun(1);
    }
}