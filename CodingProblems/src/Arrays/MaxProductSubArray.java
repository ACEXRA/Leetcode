package Arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr={6,-3,-10,0,2};
        maxProductSubarray(arr);
    }
    public static void maxProductSubarray(int[] arr){
        long prefix=1;
        long suffix=1;
        long ans=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix*=arr[i];
            suffix*=arr[arr.length-i-1];
            ans=Math.max(ans,Math.max(prefix,suffix));
        }
        System.out.println(ans);
    }
}
