package PracticeProgram;

public class CoinChange {
    public static void main(String[] args) {
        int[] arr={25,10,5};
        int v=30;
        System.out.println(coinChange(arr,v));
    }
    public static int coinChange(int[] arr,int v){
        if(v<1)return 0;
        int[] dp=new int[v+1];
        for(int i=1;i<=v;i++){
            dp[i]=v+1;
            for(int a:arr){
                if(a<=i&&dp[i-a]!=v+1){
                    dp[i]=Math.min(dp[i],1+dp[i-a]);
                }
            }
        }
        return dp[v]!=v+1?dp[v]:-1;

    }
}
