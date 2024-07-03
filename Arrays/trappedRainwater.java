package arrays;

public class trappedRainwater {
    public static int trapped(int height[]){
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for (int i=1;i<height.length;i++){
            leftmax[i]=Math.max(leftmax[i],height[i-1]);

        }
        int rightMax[]= new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for (int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i],height[i+1]);
        }
        int trapped =0;
        for (int i=0;i<height.length;i++){
            int waterLevel = Math.min(rightMax[i],leftmax[i]);
            trapped=trapped+(height[i]-waterLevel);

        }
        return trapped;

    }
    public static void main(String[] args) {
        int height []={4,2,0,6,3,2,5};
        System.out.println(trapped(height));

    }
}
