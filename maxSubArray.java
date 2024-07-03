package arrays;

public class maxSubArray {
    public static int maxSub(int arr[]){
        int max=arr[0];
        int sum =0;
        for (int i=0;i<arr.length;i++){
            int start = i;
            for (int j=i;j<arr.length;j++){
                int end =j;
                sum =0;
                for (int k=start;k<= end;k++){
                     sum = sum+ arr[k];
                     if (sum>max){
                         max =sum;
                     }
                }

            }

        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,-2,5};
        System.out.println(maxSub(arr));
    }
}
