import java.util.ArrayList;

public class LargestElementNaive {
    public static void main(String[] args) {
        int array[]={10,20,30,80,50,60};
        System.out.println(findLargest(array));
    }
    public static int findLargest(int arr[]){
        for(int i=0;i< arr.length;i++){
            boolean flag =true;
            for (int j=0;j< arr.length;j++){
                if (arr[j] >arr[i]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println(arr[i]);
                return i;
            }
        }
        return -1;
    }
}
