package function;

import java.util.Scanner;

public class prime {
    public static boolean fun(int n ){
        boolean isPrime = true;
        if (n==2){

            System.out.println(isPrime);
        }else {
            for (int i=2;i<n;i++){
                if (n%i==0){
                    isPrime=false;
                }
            }

        }
        return isPrime;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));

    }
}
