package SimpleMath;

//Given a number N. Count the number of digits in N which evenly divide N.
//
//Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
public class CountDigits {
    public static void main(String[] args) {
        System.out.println(evenlyDivide(2222222));
    }
    public static int evenlyDivide(int N){
        int temp=N;
        int count=0;
        while(temp>0){
            int rem=temp%10;
            if(rem!=0)if(N%rem==0)count++;
            temp/=10;
        }
        return count;
    }
}
