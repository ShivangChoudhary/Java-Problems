package linearSearch;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int []arr={2,7,11,15};
        int target=9;
        int[] ans = sum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sum(int[]arr, int target){
        int start=0;
        int end = arr.length-1;
        while (start<end){
            if (arr[start]+arr[end]==target){
                return new int[]{start+1,end+1};
            } else if (arr[start]+arr[end]<target) {
                start++;

            }else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
