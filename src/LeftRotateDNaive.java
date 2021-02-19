public class LeftRotateDNaive {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        int d=2;
        for (int i=0;i<d;i++){
            leftRotateOne(array);
            }
        for (int j=0;j< array.length;j++){
            System.out.print(array[j]+" ");
        }
    }
    static void leftRotateOne(int array[]){
        int temp=array[0];
        for (int i=1;i< array.length;i++){
            array[i-1]=array[i];
        }
        array[array.length-1]=temp;
    }
}
