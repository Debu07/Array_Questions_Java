public class MaximumEvenOddSubarrayNaive {
    public static void main(String[] args) {

        int array[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(evenOddArray(array));
    }
    static int evenOddArray(int array[]){
        int res=1;
        for (int i=0;i<array.length;i++){
            int curr=1;
            for (int j=i+1;j<array.length;j++){
                if (array[j]%2==0&& array[j-1]%2!=0 ||array[j-1]%2==0 && array[j]%2!=0) curr++;
                else break;
            }
            res=Math.max(res,curr);
        }
        return res;
    }
}
