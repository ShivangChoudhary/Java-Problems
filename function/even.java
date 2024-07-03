package function;

import java.util.Scanner;

public class even {
    public static boolean isEven(int n){
        boolean evenu = false;
        if (n%2==0){
            evenu=true;
        }
        return evenu;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isEven(a));
    }
}
