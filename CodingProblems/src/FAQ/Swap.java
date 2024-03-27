package FAQ;

public class Swap {
    public static void main(String[] args) {
        int a=123;
        int b=425;
        //swap with var
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        //swap without var
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}
