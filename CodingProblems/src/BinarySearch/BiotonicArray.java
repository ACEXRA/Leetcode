package BinarySearch;

public class BiotonicArray {
    public static void main(String[] args) {
        int[] arr={-1,2,3,4,5,6,4,3,2,1};
        System.out.println(peakElement(arr));
        System.out.println(search(arr,4));
    }
    public static int peakElement(int[] arr){
        int s=0;
        int e=arr.length-1;
        int mid=-1;
        while(s<=e){
            mid=(s+e)/2;
            if((mid==0||arr[mid]>=arr[mid-1])&&(mid==arr.length-1||arr[mid]>=arr[mid+1])){
                break;
            }
            if(mid>0&&arr[mid-1]>arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return mid;
    }
    public static int find(int[] arr,int s,int e,int target,boolean flag){
        if(flag){
            while(s<=e){
                int mid=(s+e)/2;
                if(arr[mid]==target)return mid;
                if(arr[mid]<target)s=mid+1;
                else e=mid-1;
            }
            return -1;
        }else{
            while(s<=e){
                int mid=(s+e)/2;
                if(arr[mid]==target)return mid;
                if(arr[mid]>target)s=mid+1;
                else e=mid-1;
            }
            return -1;
        }
    }
    public static int search(int[] arr,int target){
        int peakIdx=peakElement(arr);
        int peakEle=arr[peakIdx];
        if(peakEle==target)return peakIdx;
        if(peakEle<target)return -1;
        int val=find(arr,0,peakIdx,target,true);
        if(val!=-1){
            return val;
        }
        return find(arr,peakIdx,arr.length-1,target,false);
    }
}
