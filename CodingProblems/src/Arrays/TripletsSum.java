package Arrays;

public class TripletsSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(tripletSum(arr,7,9));
    }
    public static boolean tripletSum(int[] A,int n,int X){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(A[i]+A[j]+A[k]==X){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
