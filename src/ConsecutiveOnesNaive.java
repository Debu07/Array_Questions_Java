public class ConsecutiveOnesNaive {
    public static void main(String[] args) {
        int array[]={1,0,1,1,1,1,0,0,1,1};
        System.out.println(consecutiveOnes(array));
    }
    static int consecutiveOnes(int array[]){
        int res=0;
        for (int i=0;i< array.length;i++){
            int curr=0;
            for (int j=i;j< array.length;j++){
                if (array[j]==1) curr++;
                else break;
            }
            res=Math.max(res,curr);
        }
        return res;
    }
}
