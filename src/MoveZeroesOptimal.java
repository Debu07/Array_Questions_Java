public class MoveZeroesOptimal {
    public static void main(String[] args) {
        int array[]={10,5,0,0,0,20};
        moveZeroes(array);
    }
    static void moveZeroes(int array[]){
        int count=0;
        for (int i=0;i< array.length;i++){
            if (array[i]!=0){
                int temp=array[i];
                array[i]=array[count];
                array[count]=temp;
                count++;
            }
        }
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
