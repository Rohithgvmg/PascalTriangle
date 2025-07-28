// to find element at  a particular row r and column c
// we can (r-1)C(c-1)
// i.e nCr
// we are optimising this by observation


public class optimalV1 {
   
    static long comb(int n,int r){
          long res=1;

          for(int i=0;i<r;i++){
               res=res*(n-i);
               res=res/(i+1);
          }
          return res;

    }

    static long element(int r,int c){
         return comb(r-1,c-1);
    }

    public static void main(String[] args) {
          int r=5;
          int c=6;
          System.out.println(element(r, c));

    }
}
