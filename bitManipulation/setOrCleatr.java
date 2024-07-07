package bitManipulation;

import java.util.Scanner;

public class setOrCleatr {
    public static int check(int secCl,int n,int i){
        int bitMask = 1<<i;
        if(secCl==0){
            return n&(~bitMask);

        }else {
            return  n|bitMask;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secCl =sc.nextInt();
        int n = sc.nextInt();
        int i= sc.nextInt();
        System.out.println(check(secCl,n,i));
    }
}
