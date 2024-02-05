package Arrays.Sorting;
//Bubble sort is basically we check and swap until the array is sorted
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,7,4,8,3,1,6,9,5};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        //Outer loop to select a value
        for(int i=0;i<arr.length;i++){
            //Inner loop to compare the value with everything
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("sorted array : ");
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
