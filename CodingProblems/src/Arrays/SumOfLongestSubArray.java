package Arrays;

public class SumOfLongestSubArray {
    public static void main(String[] args) {
        int[] arr={10,5,2,7,1,9};
        sumOfLongestSubArray(arr,15);
    }
    public static void sumOfLongestSubArray(int[] arr,int target){
        int len=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                int count=0;
//                len=0;
                for(int k=i;k<=j;k++){
//                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    count++;
                }
                if(sum==target){
                    len=Math.max(count,len);
                }
            }
        }
        System.out.println(len);
    }
}
