public class RemoveDuplicatesOptimal {
    public static void main(String[] args) {
        int array[]={10,20,30,30,30,30};
        System.out.println(removeDuplicates(array));
    }
    static int removeDuplicates(int[] array) {
        int n = array.length;
        int res=1;
        for(int i=1;i<n;i++){
            if (array[i]!=array[res-1]){
                array[i]=array[res];
                res++;
            }
        }
        for(int i=0;i<res;i++){
            System.out.println(array[i]);
        }
        return  res;
    }

}
