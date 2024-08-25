import java.util.Scanner;

public class RollAndMarks {
    //WAP to store roll number and marks obtained 
    //by 4 student side by side in a matrix
    public static void main(String[] args){
        int[][] arr=new int[4][2];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<4;i++){// rows length
            for(int j=0;j<arr[i].length;j++){  //columns length
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
     
        sc.close();
    }
}
