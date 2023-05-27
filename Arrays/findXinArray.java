package array;

import java.util.Scanner;

public class findXinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n.o of items in an array : ");
        int size = sc.nextInt();
        System.out.println("Now give the arrays : ");
        int numbers[]= new int[size];

        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();

        }
        System.out.print("number you want to find in the array:");
        int x = sc.nextInt();
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==x){
                System.out.println(x+" is present at the index "+i);
            }
        }
    }
}
