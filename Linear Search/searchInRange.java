package linearSearch;

public class searchInRange {
    public static void main(String[] args) {
        int []arr = {55,6,22,3,33,58,78};
        int target = 55;
        int ans = linearSearch(arr,target,1,5);
        System.out.println(ans);
    }
    static int linearSearch(int[]arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int i=start;i<=end;i++){
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}
