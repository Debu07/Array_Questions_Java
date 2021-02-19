public class ReverseArray {
    public static void main(String[] args) {
        int array[]={10,20,30,40};
        int low=0;
        int high= array.length-1;
        while(low<high){
            int temp=array[low];
            array[low]=array[high];
            array[high]=temp;
            low++;
            high--;
        }
    }
}
