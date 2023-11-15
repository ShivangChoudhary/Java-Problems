package maths;

public class prime {
    public static void main(String[] args) {
        int n =3;

            System.out.println(primme(n));



    }
    static boolean primme(int n){
        if(n<=1){
            return false;
        }
        int c= 2;
        while (c * c <= n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
