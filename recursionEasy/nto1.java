package recursionEasy;

public class nto1 {
    public static void main(String[] args) {
        num(5);

    }
    static void num(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        num(n - 1);
    }
}
