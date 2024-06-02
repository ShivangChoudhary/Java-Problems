package arrays;

public class binarySearch {
    public static int search (int arr[],int key){
        int start=arr[0];
        int end = arr.length-1;

        while (start<=end){
           int mid=(int) (start+end)/2;
            if (arr[mid]==key){
                return mid;
            }if (arr[mid]>key){
                end=mid-1;
            }if (arr[mid]<key){
                start=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={2,6,8,10,12,15};
        int key=10;
        System.out.println(search(arr,key));
    }
}
