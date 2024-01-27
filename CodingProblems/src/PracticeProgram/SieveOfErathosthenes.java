package PracticeProgram;

import java.util.Arrays;

public class SieveOfErathosthenes {
    public static void main(String[] args) {
        primeNumber(100);
    }
    public static void primeNumber(int n){
        boolean[] check=new boolean[n+1];
        Arrays.fill(check,true);
        for(int i=2;i*i<=n;i++){
            if(check[i]){
                for(int j=i*i;j<=n;j+=i){
                    check[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(check[i]){
                System.out.print(i+" ");
            }
        }
    }
}
