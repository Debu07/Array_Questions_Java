public class MajorityElementNaive {
    public static void main(String[] args) {
        int array[]={4,3,3,3,3,3,3,1,5,1,1};
        System.out.println(majorityElement(array));
    }
    static int majorityElement(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) count++;
                if (count > array.length / 2)
                {
                    System.out.println(array[i]);
                    return i;
                }
            }

        }
        return -1;
    }
}
