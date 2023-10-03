package linearSearch;

public class searchInArray {
    public static void main(String[] args) {
        int []arr = {55,6,22,3,33,58,78};
        int target = 58;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int[]arr,int target){
        if (arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}
