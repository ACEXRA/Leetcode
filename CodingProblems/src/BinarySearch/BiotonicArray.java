package BinarySearch;

public class BiotonicArray {
    public static void main(String[] args) {
        int[] arr={-1,2,3,4,5,6,4,3,2,1};
        peakElement(arr);
        search(arr,4);
    }
    public static void peakElement(int[] arr){
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
        System.out.println(arr[mid]);
    }
    public static void search(int[] arr,int target){}
}
