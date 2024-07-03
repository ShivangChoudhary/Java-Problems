package String;

public class palindrome {
    public static void main(String[] args) {
        String str = "zvdkd";
        int n = str.length();
        for (int i=0;i<n/2;i++){
            if (str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("false");
            }else{
                System.out.println("true");
            }
        }

    }
}
