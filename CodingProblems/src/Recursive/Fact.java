package Recursive;

public class Fact {
    public static void main(String[] args) {
        System.out.println(fact(9));
        System.out.println(fact2(9));
    }
    public static long fact2(int N){
        if(N<=1) return 1;
        return N* fact(N-1);
    }
    public static long fact(int N){
        int result=1;
        while (N>0){
            result*=N;
            N--;
        }
        return result;
    }
}
