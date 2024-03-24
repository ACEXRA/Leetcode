package BinarySearch;

public class SearchMatrix {


    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(binarySearch(arr,4));
    }
    public static String binarySearch(int[][] arr,int target){
        int i=0,j=arr.length-1;
        while(i< arr.length && j>=0){
            if(arr[i][j]==target)return "row : "+i+", col : "+j;
            if(arr[i][j]>target)j--;
            else i++;
        }
        return "Not found";
    }
}
