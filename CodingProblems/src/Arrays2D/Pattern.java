package Arrays2D;

public class Pattern {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        pattern(mat);
//        for(int i=0;i<mat.length;i++){
//            for(int j=0;j<mat.length;j++){
//                so
//            }
//        }
    }
    public static void pattern(int[][] mat){
        int i=0,j=0;
        int n= mat.length;
        boolean isUp=true;
        for(int k=0;k<n*n;){
            if(isUp){
                for(;i>=0 && j<n;j++,i--){
                    System.out.print(mat[i][j]+" ");
                    k++;
                }
                if(i<0 && j<=n-1)i=0;
                if(j==n){
                    i+=2;
                    j--;
                }
            }else{
                for(;j>=0&&i<n;i++,j--){
                    System.out.print(mat[i][j]+" ");
                    k++;
                }
                if(j<0&&i<=n-1)j=0;
                if(i==n){
                    j+=2;
                    i--;
                }
            }
            isUp=!isUp;
        }
    }
}
