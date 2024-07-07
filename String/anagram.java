package String;

import java.util.Arrays;

public class anagram {
    public static boolean ana(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char newstr1[]=str1.toCharArray();
        Arrays.sort(newstr1);
        char newstr2[]=str2.toCharArray();
        Arrays.sort(newstr2);
        for(int i=0;i<newstr1.length;i++){
            for(int j=0;j<newstr2.length;j++){
                if (newstr1[0]!=newstr2[0]){
                    return false;
                }
            }
        }
        return true;



    }
    public static void main(String[] args) {
        String str1 = "wrace's";
        String str2 = "carew's";
        System.out.println(ana(str1,str2));
    }
}
