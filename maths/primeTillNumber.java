package maths;

public class primeTillNumber {
    public static void main(String[] args) {
        int n =20;
        for (int i=2;i<=n;i++){
            System.out.println(i + " "+primme(i));
        }

    }
    static boolean primme(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (c%n==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
