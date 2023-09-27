package array;
import java.util.Arrays;
import java.util.Scanner;

public class concatenation {
    public static void main(String[] args) {

        int [] nums={1,2,1};

        int n= nums.length;

        int arr[]= new int[2*n];

        int i=0;

        while (i<n) {

             arr[i] =nums[i];
        arr[i + n] = nums[i] ;

            i++;

        }System.out.println(Arrays.toString(arr) );



    }

}
