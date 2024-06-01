package function;

import java.util.Scanner;

public class average {
    public static int avg(int n,int m , int y){
        int averga = (n+m+y)/3;
        return averga;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(avg(n,m,y));
    }
}
