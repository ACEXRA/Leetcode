package SimpleMath;
//Given a number and its reverse. Find that number raised to the power of its own reverse.
//Note: As answers can be very large, print the result modulo 109 + 7.
public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
    //Normal loop method this different
    public static long power(long a, long b){
        long mod=1000000007;
        if(b==0)return 1;
        if(b==1)return a;
        if(b%2==0){
            long half=power(a,b/2);
            return (half*half)%mod;
        }else{
            return a*power(a,b-1);
        }
    }
}
