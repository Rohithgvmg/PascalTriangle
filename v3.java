
// given n , print first n rows of pascal triangle


public class v3{
      
    public static void main(String[] args){
            int n=5;
          int[][] matrix=new int[n][n];
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
              }
          }
          
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  if(matrix[i][j]==0){
                      System.out.print(" ");
                  }else{
                        System.out.print(matrix[i][j]+" ");
                  }
                
              }
              System.out.println();
    }
}
}

// n2 -> n