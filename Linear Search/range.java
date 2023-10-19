package linearSearch;

public class range {
    public static void main(String[] args) {
        int arr[]={1,2,5,6,7,2,4,1};
        int target=4;
        int start=1;
        int end=5;
        int ans = Range(arr,target,start,end);
        System.out.println(ans);

    }
    static int Range(int arr[],int target,int start,int end){
        for (int i=start;i<=end;i++){
            int element =arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}
