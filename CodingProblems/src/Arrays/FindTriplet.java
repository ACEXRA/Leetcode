package Arrays;

import java.util.Arrays;

public class FindTriplet {
    public static void main(String[] args) {
        int[] arr={1,-1,2,2,-2,5};
        System.out.println(findTriplet(arr));
    }
    public static boolean findTriplet(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int start=i+1;
            int end=arr.length-1;
            while (start<end){
                int sum=arr[i]+arr[start]+arr[end];
                if(sum==0) {
                    return true;
                }else if(sum<0){
                    start++;
                }else{
                    end--;
                }

            }
        }
        return false;
    }
}
