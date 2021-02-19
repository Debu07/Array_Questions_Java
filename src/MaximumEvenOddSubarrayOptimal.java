public class MaximumEvenOddSubarrayOptimal {
    public static void main(String[] args) {
        int array[]={1,2,2,3,4,4,5,6,7,8,9,10};
        System.out.println(maximumEvenOdd(array));
    }
    static int maximumEvenOdd(int arr[]){
        int res=1;
        int curr=1;
        for (int i=1;i<arr.length;i++){
            if (arr[i]%2==0&&arr[i-1]%2!=0 ||arr[i-1]%2==0&&arr[i]%2!=0 ){
                curr++;
                res=Math.max(res,curr);
            }
            else curr=1;
        }
        return res;
    }
}
