package Arrays.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,7,4,8,3,1,6,9,5};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        int n= arr.length;;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        System.out.print("Sorted Array : ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

}
