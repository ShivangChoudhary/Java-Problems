package array;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(6);
        list.add(4);
        System.out.println(list);
        //sort
        Collections.sort(list);
        System.out.println(list);
        //get
        int element = list.get(0);
        System.out.println(element);
        //add
        list.add(2,3);
        System.out.println(list);
        list.set(0,0);
        System.out.println(list);
        //remove
        list.remove(0);
        System.out.println(list);
        //size
        int size = list.size();
        System.out.println(size);
        //loop
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println();
    }

}
