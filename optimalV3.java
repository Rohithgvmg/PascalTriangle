public class optimalV3 {
    static void generateRow(int n){
        long ans=1;
         System.out.print(1+" ");
        for(int i=1;i<n;i++){
            ans*=(n-i);
            ans/=i;

            // first do multiplication
            // then do division
            //early integer division may invite wrong answer due to truncation
            System.out.print(ans+" ");
        }
    }
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            generateRow(i);
            System.out.println();
        }
    }
}
