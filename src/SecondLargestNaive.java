public class SecondLargestNaive {
    public static void main(String[] args) {
        int array[]={5,20,12,20,10};
        System.out.println(findSecondLargest(array));
    }
    static int findSecondLargest(int arr[]){
        int largest=findLargest(arr);
        int res=-1;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=arr[largest]){
                if (res==-1) res=i;
                else if (arr[i]>arr[res]) res=i;
            }
        }
        System.out.println(arr[res]);
        return res;
    }
    static int findLargest(int arr[]){
        int res=0;
        for(int i=1;i< arr.length;i++){
            if (arr[i]>arr[res]) res=i;
        }
        return res;
    }
}
