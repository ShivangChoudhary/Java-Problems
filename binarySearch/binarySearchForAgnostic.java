package binarySearch;

public class binarySearchForAgnostic {
    public static void main(String[] args) {
        int [] arr ={95,84,57,54,52,45,23,22,12,10};
        int target =22;
        int ans = bool(arr,target);
        System.out.println(ans);
    }
    static int bool(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        boolean isAscending = arr[start]<arr[end];

        while (start<= end){
            int mid = start+(end - start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAscending){
                if (target<arr[mid]){
                    end= mid-1;

                }else{
                    start= mid+1;
                }
            }else {
                if (target>arr[mid]){
                    end= mid -1;
                }else {
                    start= mid +1;
                }
            }
        }
        return -1;

    }
}
