package Recursive;

public class StringtoNum {
    public static void main(String[] args) {
        System.out.println(atoi("-1230"));
    }
    static int atoi(String s) {
        // Your code here
        int a=0;
        int digit=10;
        if(s.charAt(0)=='-'){
            for(int i=1;i<s.length();i++){
                int temp=s.charAt(i)-'0';
                if(temp<10 && temp>-1) {
                    a=a*digit+temp;
//                    digit=digit*10;

                }
                else return -1;
            }
            return -a;
        }else{
            for(int i=0;i<s.length();i++){
                int temp=(int)s.charAt(i)-'0';
                if(temp<10&& temp>-1) {
                    a=a*digit+temp;
//                    digit=digit*10;
                }
                else return -1;
            }
            return a;
        }
    }
}
