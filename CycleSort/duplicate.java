package sortingQues;

public class duplicate {
    public static void main(String[] args) {

    }
    static int dupli(int[]arr){
        int i =0;
        while (i< arr.length){
            if (arr[i]!=i+1){
                int correct = arr[i]-1;
                if (arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int star, int second) {
        int emp =arr[star];
        arr[star]=arr[second];
        arr[second]=emp;
    }
}
