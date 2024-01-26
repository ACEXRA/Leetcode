package Arrays;

public class CyclicArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        cyclicArray(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }

    public static void cyclicArray(int[] arr) {
        int a1=arr[arr.length-1];
        int a2=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                a2=arr[i];
                arr[i]=a1;
            }else{
                a1=arr[i];
                arr[i]=a2;
            }

        }
    }
}
