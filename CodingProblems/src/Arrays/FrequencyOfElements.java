package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr={2,3,2,3,5};
        frequencyOfElements(arr,5,5);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void frequencyOfElements(int[] arr,int N,int P){
        int[] check=new int[N];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=N){
                check[arr[i]-1]++;
            }
        }
        for(int i=0;i<N;i++){
            arr[i]=check[i];
        }
    }
}
