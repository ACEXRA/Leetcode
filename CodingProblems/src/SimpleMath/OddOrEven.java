package SimpleMath;

//Given a positive integer N, determine whether it is odd or even.
public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(125));
        System.out.println(oddOrEven(222));
    }
    public static String oddOrEven(int N){
        if(N%2==0)return "even";
        return "odd";
    }
}
