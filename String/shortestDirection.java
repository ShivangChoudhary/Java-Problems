package String;

public class shortestDirection {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        double x=0;
        double y=0;
        for (int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if (dir=='S'){
                y--;
            } else if (dir=='N'){
                y++;
            } else if (dir=='W'){
                x--;
            }else {
                x++;
            }

        }
        double X =x*x;
        double Y=y*y;
        double ans =(float) Math.sqrt(X+Y);
        System.out.println(ans);
    }
}
