package linearSearch;

public class min {
    public static void main(String[] args) {
        int arr[]={11,2,5,4,-7,6,5};
        System.out.println(minn(arr));

    }
    static int minn(int[]arr){
        int temp=arr[0];
        for (int i=0;i< arr.length;i++){

            if (arr[i]<temp){
                temp=arr[i];
            }

        }
        return temp;
    }
}
