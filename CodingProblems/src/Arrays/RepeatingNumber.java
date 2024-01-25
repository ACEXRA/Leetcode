package Arrays;

import java.util.HashMap;
import java.util.Map;

public class RepeatingNumber {
    public static void main(String[] args) {
        int[] arr={2,3,3,4,4,3,2,1};
        repeatingNumber(arr);
    }
    public static void repeatingNumber(int[] arr){
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        System.out.println(mp.toString());
    }
}
