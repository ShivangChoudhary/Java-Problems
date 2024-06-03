package arrays;

public class pair {
    public static int pairInArray(int[] arr){
        for (int i=0;i< arr.length;i++){
            int curr =arr[i];
            for (int j=i+1;j< arr.length;j++){
                System.out.print("("+curr+","+arr[j]+") ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        pairInArray(arr);
    }
}
