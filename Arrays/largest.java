package array;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= {5,6,4,2,7};
        int largest = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }System.out.println(largest);

    }
}
