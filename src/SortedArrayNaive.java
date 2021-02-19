public class SortedArrayNaive {
    public static void main(String[] args) {
        int array[] = {5,10,20,30};
        System.out.println(isSorted(array));

    }
    static boolean isSorted(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[i]) return false;
            }
        }
        return true;
    }
}
