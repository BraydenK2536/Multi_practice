package test.Rain;

public class test {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int rainCount = 0;
        for (int i = 0; i < height.length; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int i1 = 0; i1 <= i; i1++) {
                leftMax = Math.max(height[i1], leftMax);
            }
            for (int i1 = i; i1 < height.length; i1++) {
                rightMax = Math.max(height[i1], rightMax);
            }
            int tempRain = Math.min(leftMax, rightMax) - height[i];
            if (tempRain >= 0) {
                rainCount += tempRain;
            }
        }
        System.out.println(rainCount);
    }
}
