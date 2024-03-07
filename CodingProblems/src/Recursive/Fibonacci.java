package Recursive;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(50));
        int[] dp=new int[51];
        System.out.println(fibonacci2(50,dp));
    }
    public static int fibonacci(int n){
        int prev=0,curr=1,sum=0;
        for(int i=2;i<=n;i++){
            sum=(prev+curr)%1000000007;
            prev=curr;
            curr=sum;
        }
        return sum;
    }
    public static int fibonacci2(int n,int[] dp){
        if(n<2)return n;
        if(dp[n]!=0)return dp[n];
        return dp[n]=(fibonacci2(n-1,dp)+fibonacci2(n-2,dp))%1000000007;
    }
}
