public class RemoveDuplicatesNaive {
    public static void main(String[] args) {
        int array[]={10,20,30,30,30,30};
        System.out.println(removeDuplicates(array));
    }

    static int removeDuplicates(int[] array){
        int n= array.length;
        int temp[] = new int[n];
        temp[0]=array[0];
        int res=1;
        for(int i=1;i< array.length;i++){
            if (array[i]!=array[res-1]){
                temp[i]=array[i];
                res++;
            }
        }
        for(int el=0;el<res;el++){
            System.out.println(temp[el]);
        }
        return res;
    }
}
