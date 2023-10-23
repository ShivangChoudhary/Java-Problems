package linearSearch;

import java.util.Arrays;

public class dd {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,5,1},
                {11,22,55,66},
                {56,45,12,32},
                {56,23,89,23},
        };
        int target=45;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<row;col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
