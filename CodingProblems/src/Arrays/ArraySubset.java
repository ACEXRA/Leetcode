package Arrays;

import java.util.Arrays;

public class ArraySubset {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9,0};
        int[] arr2={2,4,6,7,0};
        System.out.println(arraySubset(arr1,arr2));
    }
    public static String arraySubset(int[] a1,int[] a2){
        int n=a1.length;
        int m=a2.length;
        int count=0;
        Arrays.sort(a1);
        Arrays.sort(a2);
        int j=0;
        int i=0;
        while(i<n && j<m){
            if(a1[i] == a2[j]){
                count++;
                i++;
                j++;
            }else if(a1[i]<a2[j]){
                i++;
            }else{
                j++;
            }
        }
        return count==m?"Yes":"No";
    }
}
