public class MaximumSubArraySumNaive {
    public static void main(String[] args) {
        int array[]={1,-2,3,-1,2};
        int res=0;
        for (int i=0;i< array.length;i++){
            int curr=0;
            for (int j=i;j< array.length;j++){
                curr+=array[j];
                res=Math.max(res,curr);
            }
        }
        System.out.println(res);
    }
}
