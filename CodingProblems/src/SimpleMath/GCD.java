package SimpleMath;

public class GCD {
    public static void main(String[] args) {
        System.out.println(euclidGcd(1232135,125));
    }
    public static int gcd(int a,int b){
        int result=-1;
        if(a>b){
            if(a%b==0)return b;
            for(int i=1;i<b;i++){
                if(a%i==0 && b%i==0)result=i;
            }
        }
        if(b>a){
            if(b%a==0)return b;
            for(int i=1;i<a;i++){
                if(a%i==0 && b%i==0)result=i;
            }
        }
        return result;
    }
    public static int euclidGcd(int a,int b){
        if(b==0)return a;
//        if(a==0)return b;
        return euclidGcd(b,a%b);
    }
}

//Euclidean algorithm best for GCD