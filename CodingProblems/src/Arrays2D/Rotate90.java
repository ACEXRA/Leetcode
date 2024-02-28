package Arrays2D;

public class Rotate90 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        rotate90(matrix,matrix.length);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotate90(int[][] a,int n){
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n/2;j++){
                int temp=a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=temp;
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = a[i][j];
                a[i][j]= a[j][i];
                a[j][i] = temp;
            }
        }
    }
}
