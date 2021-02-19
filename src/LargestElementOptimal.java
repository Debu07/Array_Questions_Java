public class LargestElementOptimal {
    public static void main(String[] args) {
        int array[]={10,20,30,80,50,60};
        System.out.println(findLargest(array));
    }
    static int findLargest(int arr[]){
        int res=0;
        for (int i=1;i< arr.length;i++){
            if (arr[i]>arr[res]) res=i;
        }
        return res;
    }
}
