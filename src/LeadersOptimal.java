public class LeadersOptimal {
    public static void main(String[] args) {
        int array[]={7,10,4,3,6,5,2};
        int n= array.length;;
        int LEADER=array[n-1];
        System.out.print(LEADER+" ");
        for (int i=n-2;i>=0;i--){
            if (LEADER<array[i]){
                LEADER=array[i];
                System.out.print(LEADER+" ");
            }
        }
    }
}
