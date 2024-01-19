package SimpleMath;

public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println(reverseDigit(256789));
    }
    public static long reverseDigit(long n){
        long rev=0;
        while(n>0){
            int rem=(int)n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}
