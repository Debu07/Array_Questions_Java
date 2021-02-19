public class TrappingRainWaterNaive {
    public static void main(String[] args) {
        int array[]={3,2,1,2,5};
        System.out.println(waterTrapped(array));
    }
    static int waterTrapped(int array[]){
        int res=0;
        int n=array.length;
        for (int i=1;i<n-1;i++){
            int lmax=array[i];
            for (int j=0;j<i;j++){
                lmax=Math.max(lmax,array[j]);
            }
            int rmax=array[i];
            for (int j=i+1;j<n;j++){
                rmax=Math.max(rmax,array[j]);
            }
            res+=Math.min(lmax,rmax)-array[i];
        }
        return res;
    }
}
