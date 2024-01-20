package SimpleMath;

public class PrintAllDivisor {
    public static void main(String[] args) {
        int a=99;
        printAllDivisor(a);
        optimal(a);
    }
    public static void printAllDivisor(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0) System.out.print(i+" ");
        }
        System.out.println();
    }
    //take a closer look, we can notice that the quotient of a division by one of the divisors is actually another divisor
    // . Like, 4 divides 36. The quotient is 9, and 9 also divides 36.
    //Another intuition is that the root of a number actually acts as a splitting part of all the divisors of a number.
    //Also, the quotient of a division by any divisor gives an equivalent divisor on the other side.
    // Like, 4 gives 9 while dividing 36
    //below time complexity -O(sqrt(n))
    public static void optimal(int num){
        for(int i=1;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                if(num/i==i) System.out.print(num/i+" ");
                else System.out.print(i+" "+num/i+" ");
            }
        }
    }
}
