package array;

public class arrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
}
