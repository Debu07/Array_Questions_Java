public class SortedArrayOptimal {
    public static void main(String[] args) {
        int array[]={10,10,20,30};
        System.out.println(isSorted(array));
    }
    static boolean isSorted(int arr[]){
        for (int i=1;i< arr.length;i++){
            if (arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}
