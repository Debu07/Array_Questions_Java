public class MaximumSymofK {
    public static void main(String[] args) {
        int array[]={1,8,30,-5,20,7};
        int k=3;
        System.out.println(maximumSum(array,k));
    }
    static int maximumSum(int array[],int k){
        int max_sum=Integer.MIN_VALUE;
        for (int i=0;i+k-1< array.length;i++){
            int sum=0;
            for (int j=0;j<k;j++){
                sum+=array[i+j];
            }
            max_sum=Math.max(sum,max_sum);
        }
        return max_sum;
    }
}
