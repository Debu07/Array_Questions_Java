public class StockBuyAndSellNaive {
    public static void main(String[] args) {
        int array[]={1,5,3,8,12};
        int s=0;
        int e=array.length-1;
        System.out.println(maxProfit(array,s,e));
    }
    static int maxProfit(int array[],int start,int end){
        if (start>=end) return 0;
        int profit=0;
        for (int i=start;i<end;i++){
            for (int j=i+1;j<=end;j++){
                if (array[j]>array[i]){
                    int curr_profit=array[j]-array[i]
                            +maxProfit(array,start,i-1)
                            +maxProfit(array,j+1,end);
                    profit=Math.max(profit,curr_profit);
                }
            }
        }
        return profit;
    }
}
