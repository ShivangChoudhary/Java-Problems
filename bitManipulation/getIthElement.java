package bitManipulation;

import java.util.Scanner;

public class getIthElement {
    static int get(int n, int i ){
        int bitMask =(n>>i);
        if((1&bitMask)==1){
            return 1;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i = sc.nextInt();
        System.out.println(get(n,i));
    }
}
