public class kadanesAlgo {

    // Maximum Sum Contiguous SubArray || Kadane's Algorithm
    // leetcode:53 number array problem -med difficulty;

    // ITS FOR SUB-ARRAY OF MAXIMUM SUM

    static int maxSubArr(int[]arr){
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxi=Math.max(sum,maxi);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }

    // MIN VALUE IF SUB-ARR

    static int minSubArr(int[]arr){
        int sum=0;
        int mini=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            mini=Math.min(mini,sum);
            if(sum>0){
                sum=0;

            }
        }
        return mini;
    }

    static void main() {
        int[]arr={5,-1,2,3,-4};

        // max
        System.out.println(maxSubArr(arr));
        // min
        System.out.println(minSubArr(arr));
    }
}
