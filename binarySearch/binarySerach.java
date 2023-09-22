package binarySearch;

public class binarySerach {
    public static void main(String[] args) {
        int [] arr ={2,6,13,15,45,48,56,98};
        int target = 56;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int [] arr,int target){

        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
