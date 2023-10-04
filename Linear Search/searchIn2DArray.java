package linearSearch;

import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int [][]arr={{5,6,88,96},
        {89,56,6,4},
        {54,45,4},
        {64,11,51,45}};
        int target =45;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][] arr, int target){
        for (int row=0;row<arr.length;row++){
            for (int col =0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
