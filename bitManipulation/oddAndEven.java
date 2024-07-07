package bitManipulation;

import java.util.Scanner;

public class oddAndEven {
    public static boolean check(int n){
        if((n&1)==1){
            return false;

        }else {
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }
}
