//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    int convertfive(int num) {
        // Your code here
        if(num==0){
            return 5;
        }
        int ans =0;
        int b=1;
         while(num>0){
             int a= num%10;
             if(a==0){
                 a=5;
             }
             ans = ans+b*a;
             b=b*10;
             num =num/10;
             
         }
         return ans;
    }
}