package FAQ;

public class Fibonacci {
    public static void main(String[] args) {
        int[] dp=new int[31];
        System.out.println(fibonacci(30,dp));
        System.out.println(fibonacci2(30));
    }
    public static int fibonacci(int n,int[] dp){
        if(n==0||n==1)return n;
        if(dp[n]!=0)return dp[n];
        return dp[n]=fibonacci(n-2,dp)+fibonacci(n-1,dp);
    }
    public static int fibonacci2(int n){
        int prev=0,curr=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            sum=prev+curr;
            prev=curr;
            curr=sum;
        }
        return sum;
    }
}
