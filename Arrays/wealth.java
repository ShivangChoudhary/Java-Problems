package array;

public class wealth {
    public static void main(String[] args) {
        int sum=0;
        int mun =0 ;
        int [][]p1={{1,5,20},
                {2,6,10}};
        int row= p1.length;
        int cols =p1[0].length;

        for (int i=0;i<row;i++) {
            sum = 0;


            int j;
            for (j = 0; j < cols; j++) {


                sum = sum + p1[i][j];


            }
            if (mun>sum){
                sum=mun;
            }mun=0;

            }
        System.out.println(sum);


        }




    }


