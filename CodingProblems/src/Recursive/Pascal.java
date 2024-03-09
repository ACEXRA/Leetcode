package Recursive;

import java.util.ArrayList;

public class Pascal {
    public static void main(String[] args) {
        ArrayList<Long> result=pascal(6);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i));
        }
    }
    public static ArrayList<Long> pascal(int n) {
        ArrayList<Long> list=new ArrayList<>();
        // code here
        list.add(1L);
        if(n==1){
            return list;
        }
        ArrayList<Long> prev=pascal(n-1);
        for(int i=1;i<(n+1)/2;i++){
            long val=(prev.get(i-1)+prev.get(i))%1000000007L;
            list.add(val);
        }
        for(int i=n/2-1;i>=0;i--){
            list.add(list.get(i));
        }
        return list;
    }
}
