package SimpleMath;

//You are given two integer numbers, the base a and the index b. You have to find the last digit of ab.
public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(2,10));
    }
    public static int lastDigit(int a,int b){
         double result=Math.pow(a,b);
         return (int)result%10;
    }
}
