package LinkedList;

import java.util.LinkedList;

public class lll {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("shivang");
        System.out.println(list);
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
    }
}
