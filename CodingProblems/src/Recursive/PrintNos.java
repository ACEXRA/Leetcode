package Recursive;

public class PrintNos {
    //print number using recursive func
    public static void main(String[] args) {
        printNo(1,10);
    }
    public static void printNo(int start,int limit){
        System.out.println(start++);
        if(start>limit)return;
        printNo(start,limit);
    }
}
