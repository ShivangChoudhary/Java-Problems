package linearSearch;

public class searchInString {
    public static void main(String[] args) {

        String name ="Shivang";
        char target ='f';
        String ans = String.valueOf(search(name,target));
        System.out.println(ans);



    }
    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
