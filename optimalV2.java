
// given row number, print nth row

public class optimalV2 {
    public static void main(String[] args) {
        int n=6;
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
}

