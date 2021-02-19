public class MaximumSumKOptimal {
    public static void main(String[] args) {
        int array[]={1,8,30,-5,20,7};
        int window_size=3;
        System.out.println(slidingWindowSum(array,window_size));
    }
    static int slidingWindowSum(int array[],int k){
        int max_sum=0;
        for (int i=0;i<k;i++){
            max_sum+=array[i];
        }
        int curr_sum=max_sum;
        for (int i=k;i< array.length;i++){
            max_sum+=(array[i]-array[i-k]);
            curr_sum=Math.max(curr_sum,max_sum);
        }
        return curr_sum;
    }
}
