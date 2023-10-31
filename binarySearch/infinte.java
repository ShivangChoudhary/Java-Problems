package binarySearch;

public class infinte {
    public static void main(String[] args) {
        int arr[]={2,5,7,11,15,17,19};
        int target=7;
        System.out.println(infinte(arr,target));

    }
    static int infinte(int[]arr,int target){
        int start=0;
        int end=1;
        while (target>arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start =temp;
        }
        return seaarch(arr,target,start,end);
    }

    private static int seaarch(int[]arr,int target,int start,int end) {
        while (start<=end){
            int mid= start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;

            }else {
                return mid;
            }
        }
        return -1;
    }

}
