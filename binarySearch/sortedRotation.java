package binarySearch;

public class sortedRotation {
    public static void main(String[] args) {
        int arr[]={2,4,7,12,0,6};
        System.out.println(rotation(arr));

    }
    static int rotation(int[]arr){
        int pivot=peak(arr);
        return pivot+1;
    }
    static int peak(int[]arr){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }if (mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }if (arr[mid]<=arr[start]){
                end=mid-1;

            }else {
                mid=start+1;
            }
        }
        return -1;

    }
}
