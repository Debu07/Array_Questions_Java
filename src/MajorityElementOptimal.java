//Moore's Voting Algorithm
public class MajorityElementOptimal {
    public static void main(String[] args) {
        int array[]={1,2,1,3,1,4,1,1,1};
        majorityElement(array);
    }
    static void majorityElement(int array[]){
        int majorityElement=0;
        int count=1;
        for (int i=1;i< array.length;i++){
            if (array[i]==array[majorityElement]) count++;
            else count--;

            if (count==0){
                majorityElement=i;
                count=1;
            }
        }
        System.out.println(checkMajority(array,majorityElement));
    }
    static int checkMajority(int array[],int element){
        int counter=0;
        for (int j=0;j<array.length;j++){
            if (array[j]==array[element])
                counter++;
        }
        if (counter>array.length/2) return array[element];
        else return -1;
    }
}
