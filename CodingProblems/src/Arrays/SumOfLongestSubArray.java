package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfLongestSubArray {
    public static void main(String[] args) {
        int[] arr={10,5,2,7,1,9};
        sumOfLongestSubArray(arr,15);
    }
    public static void sumOfLongestSubArray(int[] arr,int target){
        Map<Integer,Integer> mp=new HashMap<>();
        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==target){
                len=Math.max(len,i+1);
            }
            if(mp.containsKey(sum-target)){
                len=Math.max(len,i-mp.get(sum-target));
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        System.out.println(len);
    }
}
