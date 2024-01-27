package Arrays;

public class CyclicArrayK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        cyclicArrayK(arr,6);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }

    public static void cyclicArrayK(int[] arr, int k) {
        while(k>0){
            cyclicArray(arr);
            k--;
        }
    }
    public static void cyclicArray(int[] arr) {
        int a1=arr[0];
        int a2=0;
        for(int i= arr.length-1;i>=0;i--){
            if(i%2!=0){
                a2=arr[i];
                arr[i]=a1;
            }else{
                a1=arr[i];
                arr[i]=a2;
            }
        }
    }
}
