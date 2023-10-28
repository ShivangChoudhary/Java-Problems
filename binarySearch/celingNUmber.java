package binarySearch;

public class celingNUmber {
    public static void main(String[] args) {
        int arr[]={2,5,8,11,19};
        int target=13;
        int ans=number(arr,target);
        System.out.println(ans);

    }
    static int number(int[]arr,int target){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;

            } else {
                return mid;
            }
        }
        return start;
    }
}
