public class SpiralMatrix2{
    public static void main(String[] args) {
        int n=4;
        int el=n*n;
        
        int dig=1;
        int[][]a=new int[n][n];

        int minr=0, minc=0 ,maxr=n-1,maxc=n-1;

        while(minr<=maxr&&minc<=maxc){
            //left -> right
            for(int i=minc;i<=maxc;i++){
                a[minr][i]=dig++;
            }
            minr++;

            //top -> bottom
            for(int i=minr;i<=maxr;i++){
                a[i][maxc]=dig++;
            }
            maxc--;

            //right ->left
            if(minc<=maxc){
                for(int i=maxc;i>=minc;i--){
                    a[maxr][i]=dig++;
                }
                maxr--;
            }

            //down -> up
            if(minr<=maxr){
                for(int i=maxr;i>=minr;i--){
                    a[i][minc]=dig++;
                }
                minc++;
            }
            
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}