package String;

public class subString {
    public static void main(String[] args) {
            String na = "Hello World";
            String neew="";
            int start=0;
            int end =4;
            for (int i=start;i<end;i++){
                neew=neew+na.charAt(i);
            }
        System.out.println(neew);
    }
}
