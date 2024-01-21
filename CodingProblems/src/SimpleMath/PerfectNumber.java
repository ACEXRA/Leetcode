package SimpleMath;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(perfectNumber(6));
    }

    private static boolean perfectNumber(int num) {
        int count=0;
        for(int i=1;i<num;i++){
            if(num%i==0)count+=i;
        }
        return num==count;
    }
}
