package arrays;

public class linearSearch {
    public static void main(String[] args) {
        int arr[]={5,9,8,7,6,65};
        int k =7;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==k){
                System.out.println(i);
            }else {
                System.out.println(-1);
            }
        }
    }
}
