package BinarySearch;

public class SearchInfyArray {
    //this  technique particularly for infinitely long array
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(searchInfyArray(arr,8));
    }
    public static int searchInfyArray(int[] arr,int target){
        int low=0;
        int high=1;
        while(arr[high]<target){
            low=high;
            high=high*2;
        }
        return binarySearch(arr,low,high,target);
    }
    public static int binarySearch(int[] arr,int low, int high,int target){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)return mid;
            if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
