package String;

public class reverse {
    public static void main(String[] args) {
        String str = "abcba";
        String str2="";
        for(int i=0;i<str.length();i++){
            char ans = str.charAt(i);
            str2=str2+ans;
        }
        System.out.println(str2);
    }
}
