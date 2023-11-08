package Recursionn;

public class number {
    public static void main(String[] args) {
        no(1);

    }
    static void no(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        no(n+1);


    }
}
