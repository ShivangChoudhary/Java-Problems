package function;

import java.util.*;

public class palindrome {

    public static int isPalin(int n){
        int f=n;
        int rev=0;

        while (f!=0){
             int ld=f%10;
            rev=rev*10+ld;
            f=f/10;



        }
//        if(rem==n){
//            return true;
//
//        }else {
//            return false;
//        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalin(n));

    }
}
