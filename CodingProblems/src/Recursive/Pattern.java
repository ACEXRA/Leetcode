package Recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pattern {
    static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        pattern(16);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void pattern(int N){
        if(N<=0){
            list.add(N);
            return;
        }
        list.add(N);
        pattern(N-5);
        list.add(N);
        return;
    }
}
