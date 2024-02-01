package Arrays;

public class TripletsSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(tripletSum(arr,7,9));
    }
    public static boolean tripletSum(int[] A,int n,int X){
        for(int i=0;i<n;i++){
           int j=i+1;
           int k=n-1;
           while(j<k){
               int sum=A[i]+A[j]+A[k];
               if(sum==X)return true;
               if(sum<X){
                   j++;
               }else{
                   k--;
               }
           }
        }
        return false;
    }
}
