public class LeftRotateDBest {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        int d =3;
        reverseArray(array,0,d-1);
        reverseArray(array,d, array.length-1);
        reverseArray(array,0, array.length-1);
        for (int i=0;i< array.length;i++) System.out.print(array[i]+" ");

    }
    static void reverseArray(int array[],int low,int high){
        while(low<high){
            int temp=array[low];
            array[low]=array[high];
            array[high]=temp;
            low++;
            high--;
        }
    }
}
