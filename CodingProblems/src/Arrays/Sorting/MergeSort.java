package Arrays.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,2,9,8,5,1,0};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int[] arr,int l,int h){
        if(l<h){
            int m=l+(h-l)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,h);

            merge(arr,l,m,h);
        }
    }
    public static void merge(int[] arr,int l,int m,int h){
        int n1=m-l+1;
        int n2=h-m;
        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
}
