package linearSearch;

public class minimumInArray {
    public static void main(String[] args) {
        int[] arr={55,56,8,44,22,-5,52,66};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i=1;i< arr.length;i++){
            if (ans>arr[i]){
                ans = arr[i];
            }
        }
        return ans;

    }
}
