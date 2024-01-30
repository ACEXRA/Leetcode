package Arrays;

public class TwoSum {


    public static void main(String[] args) {
        int[] arr={6,6,1,2,3,4};
        System.out.println(twoSum(arr,6,12));
    }
    public static boolean twoSum(int[] arr,int n,int x){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (sum == x) return true;
            }
        }
        return false;
    }
}
