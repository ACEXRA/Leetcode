package Arrays;

public class TrappingWater {
    public static void main(String[] args) {
        int[] arr={3,0,0,2,0,4};
        trappingWater(arr);
    }
    public static void trappingWater(int[] arr){
        int start=0;
        int end=arr.length-1;
        int leftMax=0;
        int rightMax=0;
        int ans=0;
        while(start<=end){
            if(arr[start]<=arr[end]){
                if(arr[start]>=leftMax){
                    leftMax=arr[start];
                }else{
                    ans=ans+leftMax-arr[start];
                }
                start++;
            }else{
                if(arr[end]>=rightMax){
                    rightMax=arr[end];
                }else {
                    ans=ans+rightMax-arr[end];
                }
                end--;
            }
        }
        System.out.println(ans);
    }
}
