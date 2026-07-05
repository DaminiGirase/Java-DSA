import java.util.*;
public class trappingRainWater {

        public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int n = height.length;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        int water = 0;

        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            water += (waterLevel - height[i]);
        }

        System.out.println("Traped Water is: " + water);

       
    }
}
