package BinarySearch;

public class RightRotatedarray {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3,4};
        System.out.println(rightRotatedArray(arr,0,arr.length-1));
    }
    public static int rightRotatedArray(int[] arr,int s,int e){
            int mid=(s+e)/2;
            if(mid<e && arr[mid+1]<arr[mid]){
                return mid+1;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[e]>arr[mid]){
                return rightRotatedArray(arr,s,mid-1);
            }
            return rightRotatedArray(arr,mid+1,e);
    }
}
