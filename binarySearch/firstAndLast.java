package binarySearch;

public class firstAndLast {
    public static void main(String[] args) {

    }
    public int[] search(int[] nums,int target){
        int[] ans ={-1,-1};
        int start =starts(nums,target,true);
        int end=starts(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public int starts (int[]nums,int target,boolean findStart){
        int ans =-1;
        int start=0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>nums[mid]){
                start=mid+1;
            } else if (target < nums[mid]) {
                end=mid-1;

            }else {
                ans=mid;
                if (findStart==true){
                    end=mid-1;
                }else {
                    start=mid+1;
                }

            }
        }
        return ans;


    }
}
