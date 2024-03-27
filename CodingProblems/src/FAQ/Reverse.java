package FAQ;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    //Reverse an string
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        char[] ch=s.toCharArray();
        int l=0,h=s.length()-1;
        while(l<=h){
            char temp=ch[l];
            ch[l]=ch[h];
            ch[h]=temp;
            l++;
            h--;
        }
        StringBuilder str=new StringBuilder();
        for(char c:ch){
            str.append(c);
        }
        return str.toString();
    }
}
