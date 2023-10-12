package array;

import java.util.ArrayList;
import java.util.List;

public class candy_problem {
    static List<Boolean>list=new ArrayList<>();

    public static void main(String[] args) {
        int []can={2,3,5,1,3};
        int extra=3;
        System.out.println(big(can,extra));
    }
    public static List<Boolean> big(int[] can, int extra) {
        int great = can[0];

        for (int i = 0; i < can.length; i++) {
            if (can[i] > great) {
                great = can[i];
            }
        }
        for ( int i=0;i< can.length;i++) {


            if (can[i] + extra >=great)
                list.add(true);

            else
                list.add(false);

        }


        return list;

    }
}
