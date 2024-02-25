package Arrays;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        //to find contiginious max sum of subarray
        int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
        kadaneAlgorithm(arr);
    }
    public static void kadaneAlgorithm(int[] arr){
        int size=arr.length;
        //Maintain a current sum
        int curr_sum=0;
        //a max sum
        int max_sum=Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            //find curr sum
            curr_sum+=arr[i];
//            if sum positive and greater than max save in max sum
            if(curr_sum>max_sum){
                max_sum=curr_sum;
            }
            // or make curr sum 0
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        System.out.println(max_sum);
    }
}
