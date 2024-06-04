package arrays;

public class kadanesAlgorithm {
    public static void main(String[] args) {
        int arr []={1,2,-1,5,8};
        int curr=0;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curr=curr+arr[i];
          max= Math.max(curr,max);
            if (curr<0){
                curr=0;
            }
        }
        System.out.println(max);
    }
}
