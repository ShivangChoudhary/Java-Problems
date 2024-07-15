//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            int k = Integer.parseInt(read.readLine().trim());
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution obj = new Solution();
            int ans = obj.getPairsCount(nums, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java



class Solution {
    int getPairsCount(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array
        
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            
            if (currentSum == k) {
                int leftValue = arr[left];
                int rightValue = arr[right];
                
                // If both elements are the same
                if (leftValue == rightValue) {
                    int numElements = right - left + 1;
                    count += numElements * (numElements - 1) / 2;
                    break;
                }
                
                // Count how many times leftValue appears
                int leftCount = 0;
                while (left < right && arr[left] == leftValue) {
                    left++;
                    leftCount++;
                }
                
                // Count how many times rightValue appears
                int rightCount = 0;
                while (left <= right && arr[right] == rightValue) {
                    right--;
                    rightCount++;
                }
                
                count += leftCount * rightCount;
            } else if (currentSum < k) {
                left++;
            } else {
                right--;
            }
        }
        
        return count;
    }
}
