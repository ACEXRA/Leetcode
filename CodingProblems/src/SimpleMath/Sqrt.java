package SimpleMath;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(6));
    }
    public static int sqrt(int num){
        int result=0;
        for(int i=1;i<num;i++){
            if(num/i==i)return i;
            if(num/i>i)result=i;
        }
        return result;
    }
}
