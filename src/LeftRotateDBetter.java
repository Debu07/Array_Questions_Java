public class LeftRotateDBetter {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        int d=3;
        int n=array.length;
        int temp[]=new int[d];
        for (int i=0;i<d;i++){
            temp[i]=array[i];
        }
        for (int j=d;j<n;j++){
            array[j-d]=array[j];
        }
        for (int k=0;k<d;k++){
            array[n-d+k]=temp[k];
        }
        for (int el=0;el<n;el++) System.out.print(array[el]+" ");
    }
}
