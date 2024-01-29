package PracticeProgram;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={1,7,3,4,8,7,9};
        nextPermutation(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    public static void nextPermutation(int[] arr){
        int idx=0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            for(int i=0;i<arr.length/2;i++){
                int temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }
            return;
        }
        for(int i=arr.length-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                break;
            }
        }
        int k=arr.length-1;
        // reverse remaining
        for(int j=idx+1;j<=(arr.length+idx)/2;j++){
            int temp=arr[k];
            arr[k]=arr[j];
            arr[j]=temp;
            k--;
        }
    }
}
