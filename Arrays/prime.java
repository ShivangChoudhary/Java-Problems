package functions;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(prime(a));
    }
    static boolean prime(int a){
        if (a<=1){
            return false;
        }
        int i=2;
        while (i*i<=a){
            if (a%i==0){
                return false;
            }
            i++;
        }
        if (i*i>a){
            return true;
        }
        return false;
    }

}