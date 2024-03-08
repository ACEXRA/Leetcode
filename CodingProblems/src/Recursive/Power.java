package Recursive;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(21,12));
    }
    public static long power(int N, int R){
        if(R==0)return 1;
        if(R==1)return N;
        if(R%2==0){
            long halfPow=power(N,R/2);
            return (halfPow*halfPow)%1000000007;
        }else{
            return (N*power(N,R-1))%1000000007;
        }
    }
}
