public class MaximumSubArraySumOptimal {
    public static void main(String[] args) {
        int array[]={1,-2,3,-1,2};
        int res=array[0];
        int maxSum=array[0];
        for (int i=1;i< array.length;i++) {
            maxSum = Math.max(array[i], array[i] + maxSum);
            res=Math.max(res,maxSum);
        }
        System.out.println(res);
    }
}
