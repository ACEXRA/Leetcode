package BinarySearch;

public class Search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,2));
    }
    public static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)return 1;
            else if(arr[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }
}
