package FAQ;

public class Palindrome {
    public static void main(String[] args) {
        String a="malayalam";
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
