public class StockBuyAndSellOptimal {
    public static void main(String[] args) {
        int array[]={1,5,3,8,12};
        int profit=0;
        for (int i=1;i< array.length;i++){
            if (array[i]>array[i-1]) profit+=array[i]-array[i-1];
        }
        System.out.println(profit);
    }
}
