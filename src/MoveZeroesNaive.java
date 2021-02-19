public class MoveZeroesNaive {
    public static void main(String[] args) {
        int array[]={8,5,0,20,0,10};
        System.out.println(moveZeroes(array));
    }
    static int moveZeroes(int array[]){
        for(int i=0;i< array.length;i++){
            if (array[i]==0){
                for (int j=i+1;j< array.length;j++){
                    if (array[j]!=0){
                        int temp=array[j];
                        array[j]=array[i];
                        array[i]=temp;
                    }
                }
            }
        }
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
        return 0;
    }
}
