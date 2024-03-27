package FAQ;

import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        System.out.println(prime(3));
        primePrint(100);
    }
    public static boolean prime(int n){
        if(n==0||n==1)return false;
        for(int i=2;i<n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void primePrint(int n){
        boolean[] check=new boolean[n+1];
        Arrays.fill(check,true);
        for(int i=2;i*i<=n;i++){
            if(check[i]){
                for(int j=i*i;j<=n;j+=i){
                    check[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(check[i]) System.out.print(i+" ");
        }
    }
}
