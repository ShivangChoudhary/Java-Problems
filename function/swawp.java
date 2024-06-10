package function;

import java.util.Scanner;

public class swawp {
    public static void change(int num1, int num2){
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println(num1);
        System.out.println(num2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       change(a,b);
    }
}
