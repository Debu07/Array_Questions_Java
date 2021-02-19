public class TrappingRainWaterOptimal {
    public static void main(String[] args) {
        int array[]={3,2,1,2,5};
        System.out.println(waterTrapped(array));
    }
    static int waterTrapped(int array[]){
        int res=0;
        int n= array.length;;
        int lmax[] = new int[n];
        lmax[0]=array[0];
        for (int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],array[i]);
        }
        int rmax[]=new int[n];
        rmax[n-1]=array[n-1];
        for (int j=n-2;j>=0;j--){
            rmax[j]=Math.max(array[j],rmax[j+1]);
        }
        for (int k=1;k<n-1;k++){
            res+=Math.min(lmax[k],rmax[k])-array[k];
        }
        return res;
    }
}
