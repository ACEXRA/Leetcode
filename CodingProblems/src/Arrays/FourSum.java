package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr={-1,-2,0,0,1,2};
        fourSum(arr,0);
    }
    public static void fourSum(int[] arr,int target){
        Arrays.sort(arr);
        List<List<Integer>> resul=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i>0&&arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(j>i+1&&arr[j]==arr[j-1]){
                    continue;
                }
                int start=j+1;
                int end=arr.length-1;
                while(start<end){
                    long sum=arr[i]+arr[j]+arr[start]+arr[end];
                    if(sum==target){
                        resul.add(Arrays.asList(arr[i],arr[j],arr[start],arr[end]));
                        start++;
                        end--;
                    }else if(sum<target){
                        start++;
                    }else{
                        end--;
                    }
                }
            }
        }
        System.out.println(resul.toString());
    }
}
