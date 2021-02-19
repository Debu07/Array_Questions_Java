public class CircularSubArraySumNaive {
    public static void main(String[] args) {
        int array[]={5,-2,3,4};
        int res=array[0];
        for (int i=0;i< array.length;i++){
            int curr_max=array[i];
            int curr_sum=array[i];
            for (int j =1;j< array.length;j++){
                int index=(i+j)% array.length;
                curr_sum+=array[index];
                curr_max=Math.max(curr_max,curr_sum);
            }
            res=Math.max(res,curr_max);
        }
        System.out.println(res);
    }
}
