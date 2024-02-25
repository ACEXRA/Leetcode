package Arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={3,5,5,6,4,5,5};
        majorityElement(arr);
    }
    public static void majorityElement(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);
    }
}

