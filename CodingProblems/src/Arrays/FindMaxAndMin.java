package Arrays;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr={1000,23213,333,232,1,2323,564,1000000,27999829,263728292};
        int[] a=findMaxAndMin(arr);
        System.out.println(a[0]+" "+a[1]);
    }
    public static int[] findMaxAndMin(int[] arr){
        int min=arr[0];
        int max=arr[arr.length-1];
        for(int n:arr){
            if(min>n)min=n;
            if(max<n)max=n;
        }
        return new int[] {min,max};
    }
}
