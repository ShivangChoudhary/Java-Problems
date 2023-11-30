package recursionEasy;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palin(1234321));

    }

    static int sum;

    static void rev(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);

    }

    static boolean palin(int n) {
        return n == sum;
    }
}

