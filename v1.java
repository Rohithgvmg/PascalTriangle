// Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
public class v1{

    static int solve(int row,int col,int n,int[][] matrix){
            for(int i=0;i<n;i++){
              int curRow=i;
              for(int j=0;j<curRow+1;j++){
                   int curCol=j;
                   //base case
                    if(curCol==0 && curRow==0){
                       matrix[curRow][curCol]=1;
                       continue;
                   }
                   
                  int a=0;
                  int b=0;
                   if(curRow-1>=0 && curCol-1>=0){
                       a=matrix[curRow-1][curCol-1];
                   }
                   if(curRow-1>=0 && curCol>=0){
                        b=matrix[curRow-1][curCol];
                   }
                   
                   matrix[curRow][curCol]=a+b;
                   if(curRow==row-1 && curCol==col-1){
                        return matrix[curRow][curCol];
                   }
              }
          }
          return -1;
    }

    public static void main(String[] args){
        int  N = 5;
        int r = 3;
        int c = 2;
        int[][] matrix=new int[N][N];
        int ans=solve(r,c,N,matrix);
        System.out.println(ans);
    }
}
