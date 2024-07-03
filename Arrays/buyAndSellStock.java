package arrays;

public class buyAndSellStock {
    public static int makeProfit(int arr[]){
        int maxProfit=0;
        int buy = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (buy<arr[i]){
                int profit = arr[i]-buy;
                maxProfit = Math.max(maxProfit,profit);
            }
            if(buy>arr[i]){
                buy=arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(makeProfit(arr));
    }
}
