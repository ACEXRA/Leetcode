package FAQ;

public class Vowel {
    public static void main(String[] args) {
        String vowel="aeiou";
        String given="bbbbb";
        int count=0;
        for(char c:vowel.toCharArray()){
            if(given.indexOf(c)!=-1){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
