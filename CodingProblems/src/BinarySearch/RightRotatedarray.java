package BinarySearch;

public class RightRotatedarray {
    public static void main(String[] args) {
        int[] arr={5,1,2,3,4};
        System.out.println(rightRotatedArray(arr));
    }
    public static int rightRotatedArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return i;
            }
        }
        return 0;
    }
}
